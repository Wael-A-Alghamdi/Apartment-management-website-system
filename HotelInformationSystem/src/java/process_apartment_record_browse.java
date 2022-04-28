
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class process_apartment_record_browse extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hotel_information_system";

    //  Database credentials
    static final String USER = "apartmentsRecordsUser";
    static final String PASS = "654321";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\"/>");
            out.println("<meta name=\"description\"content=\"Experience five-star hotel luxury at Stein Eriksen Lodge, the Park City Resort with world-renowned skiing.\"/>");
            out.println("<meta name=\"keywords\" content=\"luxury hotel, five-star hotel, luxury hotel at Stein Eriksen Lodge, Best Ski Hotel \"/>");
            out.println("<meta name=\"author\" content=\"Wael Ahmad Alghamdi and Abdulaziz Talaq Alsulami\"/>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" />");
            out.println("<title> Servlet process browse all apartments records  </title>");
            out.println("</head>");
            out.println("<body>");
            /////////////////////////////////////////////////// header
            out.println("<div class=\"header\">");
            out.println("<div class=\"header-container\">");
            out.println("<img alt=\"logo of Stein Eriksen Lodge Deer Valley\" src=\"images/logo.png\" />");
            out.println("</div>");
            out.println("<div class=\"header-container\">");
            out.println("<ul>");
            out.println("<li><a href=\"index.html\">Home</a></li>");
            out.println("<li> <a href=\"add-new-apartment-record.html\" >Add New Apartment Record</a > </li>");
            out.println("<li><a class=\"active\" href=\"browse_apartment_record\">Apartments Records</a></li>");
            out.println("<li><a href=\"feedback.html\">Feedback</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            ///////////////////////////////////////////////////
            out.println("<div id=\"title\">");
            out.println("<h1>Apartments Records Table</h1>");
            out.println("</div>");
            out.println("<div>");

            //Loading and register a JDBC Driver
            Class.forName(JDBC_DRIVER);

            //Establishing a Connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "select * from apartments";

            PreparedStatement pStmt = conn.prepareStatement(sql);
            ResultSet rs = pStmt.executeQuery();

            if (!rs.isBeforeFirst()) {
                out.println("<br />");
                out.println("<br />");
                out.println("<hr />");
                out.println("<div class=\"ansContainer\">");
                out.println("<p> No apartments records in database! </p>");
                out.println("</div>");
            } else {
                out.println("<br />");
                out.println("<br />");
                out.println("<hr />");
                out.println("<div class=\"tableContainer\">");

                out.println("<table class=\"apartment_record_table\" >");
                out.println("<tr> <th> ID </th> <th> Apartment Number </th> <th> Floor Number </th> <th> Number Of Rooms </th> <th> Occupied </th> <th> Price </th> <th> Payment </th> <th> Payment DateTime </th> <th> Rent Start Date </th> <th> Rent End Date </th> <th> Renter National ID </th> <th> Renter Name </th> <th> Creation DateTime </th> </tr>");

                while (rs.next()) {

                    out.println("<tr>");

                    out.println("<td>" + rs.getInt("ID") + "</td>");
                    out.println("<td>" + rs.getString("apartment_number") + "</td>");
                    out.println("<td>" + rs.getInt("floor_number") + "</td>");
                    out.println("<td>" + rs.getInt("number_of_rooms") + "</td>");
                    out.println("<td>" + rs.getInt("occupied") + "</td>");
                    out.println("<td>" + rs.getInt("price") + "</td>");
                    out.println("<td>" + rs.getInt("payment") + "</td>");
                    out.println("<td>" + rs.getString("payment_datetime") + "</td>");
                    out.println("<td>" + rs.getString("rent_start_date") + "</td>");
                    out.println("<td>" + rs.getString("rent_end_date") + "</td>");
                    out.println("<td>" + rs.getString("renter_national_id") + "</td>");
                    out.println("<td>" + rs.getString("renter_name") + "</td>");
                    out.println("<td>" + rs.getTimestamp("creationDateTime") + "</td>");

                    out.println("</tr>");

                }

                out.println("</table>");
                out.println("</div>");
            }

            conn.close();

            //out.println("</div>");
            //out.println("<hr />");
            //out.println("</body>");
            //out.println("</html>");
        } catch (Exception ex) {
            //throw new ServletException(ex);

            out.println("<br />");
            out.println("<br />");
            out.println("<hr />");
            out.println("<div class=\"ansContainer\">");
            out.println("<p class=\"error\"> There was an error exception meesage: " + ex + "</p>");
            out.println("</div>");

            //out.println("</div>");
            //out.println("<hr />");
            //out.println("</body>");
            //out.println("</html>");
        } finally {
            out.println("</div>");
            out.println("<hr />");
            /////////////////////////////////////////////////// footer
            out.println("<div class=\"footerServlet\">");
            out.println("<ul>");
            out.println("<li><p>Stein Eriksen Lodge Deer Valley</p></li>");
            out.println("<span class=\"f-d\"> | </span>");
            out.println("<li><p>7700 Stein Way</p></li>");
            out.println("<span class=\"f-d\"> | </span>");
            out.println("<li>​<p>​Park City, Utah 84060 Reservations: (866) 996-0034</p></li>");
            out.println("<span class=\"f-d\"> | </span>");
            out.println("<li><p>Email: info@steinlodge.com​ NOTICE OF ACCESSIBILITY</p></li>");
            out.println("<div></div>");
            out.println("<li class=\"footer-li\"><p>PRIVACY POLICY TERMS & CONDITIONS</p></li>");
            out.println("<span class=\"f-d\"> | </span>");
            out.println("<li><p>CANCELLATION POLICY TRAVEL INFORMATION Stein Eriksen Lodge Deer Valley</p></li>");
            out.println("<span class=\"f-d\"> | </span>");
            out.println("<li><p>Copyright © 2022 by Wael Ahmad Alghamdi & Abdulaziz Talaq Alsulami.</p></li>");
            out.println("</ul>");
            out.println("</div>");
///////////////////////////////////////////////////
            out.println("</body>");
            out.println("</html>");

            out.close();
        }
    }

    //public java.sql.Date getCurrentDatetime() {
    //    java.util.Date today = new java.util.Date();
    //    return new java.sql.Date(today.getTime());
    //}
}
