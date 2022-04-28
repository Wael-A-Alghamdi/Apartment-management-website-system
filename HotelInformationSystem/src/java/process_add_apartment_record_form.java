
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

public class process_add_apartment_record_form extends HttpServlet {

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            String apartmentNumber = request.getParameter("apartmentnumber");
            String floorNumber = request.getParameter("floornumber");
            String numberOfRooms = request.getParameter("numberofrooms");
            String occupied = request.getParameter("occupied");
            String price = request.getParameter("price");
            String payment = request.getParameter("payment");
            String paymentDateTime = request.getParameter("paymentdatetime");
            String rentStartDate = request.getParameter("rentstartdate");
            String rentEndDate = request.getParameter("rentenddate");
            String renterNationalID = request.getParameter("renternationalid");
            String renterName = request.getParameter("rentername");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\"/>");
            out.println("<meta name=\"description\"content=\"Experience five-star hotel luxury at Stein Eriksen Lodge, the Park City Resort with world-renowned skiing.\"/>");
            out.println("<meta name=\"keywords\" content=\"luxury hotel, five-star hotel, luxury hotel at Stein Eriksen Lodge, Best Ski Hotel \"/>");
            out.println("<meta name=\"author\" content=\"Wael Ahmad Alghamdi and Abdulaziz Talaq Alsulami\"/>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" />");
            out.println("<title> Servlet process add new apartment record result </title>");
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
            out.println("<li><a href=\"add-new-apartment-record.html\" >Add New Apartment Record</a > </li>");
            out.println("<li><a href=\"browse_apartment_record\">Apartments Records</a></li>");
            out.println("<li><a href=\"feedback.html\">Feedback</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            ///////////////////////////////////////////////////
            out.println("<div>");

            //Loading and register a JDBC Driver
            Class.forName(JDBC_DRIVER);

            //Establishing a Connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT INTO apartments (apartment_number,floor_number,number_of_rooms,"
                    + "occupied,price,payment,payment_datetime,rent_start_date,rent_end_date,"
                    + "renter_national_id,Renter_name,creationDateTime) VALUES (?,?,?,?,?,?,"
                    + "?,?,?,?,?,NOW())";   //NOW() mysql function
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, apartmentNumber);             // 1 specifies the first parameter in the query  
            pStmt.setString(2, floorNumber);             // 2 specifies the second parameter in the query
            pStmt.setString(3, numberOfRooms);
            pStmt.setString(4, occupied);
            pStmt.setString(5, price);

            if (payment == "") {
                pStmt.setString(6, null);
            } else {
                pStmt.setString(6, payment);
            }
            if (paymentDateTime == "") {
                pStmt.setString(7, null);
            } else {
                pStmt.setString(7, paymentDateTime);
            }

            if (rentStartDate == "") {
                pStmt.setString(8, null);
            } else {
                pStmt.setString(8, rentStartDate);
            }

            if (rentEndDate == "") {
                pStmt.setString(9, null);
            } else {
                pStmt.setString(9, rentEndDate);
            }

            if (renterNationalID == "") {
                pStmt.setString(10, null);
            } else {
                pStmt.setString(10, renterNationalID);
            }

            if (renterName == "") {
                pStmt.setString(11, null);
            } else {
                pStmt.setString(11, renterName);
            }

            //java.sql.Date date = getCurrentDatetime();
            //pStmt.setDate(3, date);
            int k = pStmt.executeUpdate();     // returns number of affected rows

            if (k == 1) {
                //insert a record success
                out.println("<br />");
                out.println("<br />");
                out.println("<hr />");
                out.println("<div class=\"ansContainer\">");
                out.println("<p class=\"correct\"> Data was added successfully. </p>");
                out.println("</div>");

            } else // i.e.  k = 0
            {
                //insert a record error
                out.println("<br />");
                out.println("<br />");
                out.println("<hr />");
                out.println("<div class=\"ansContainer\">");
                out.println("<p class=\"errorServlet\"> There was an error in adding the data! Try again. </p>");
                out.println("</div>");

            }

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

        } catch (Exception ex) {
            //throw new ServletException(ex);
            out.println("<br />");
            out.println("<br />");
            out.println("<hr />");
            out.println("<div class=\"ansContainer\">");
            out.println("<p class=\"errorServlet\"> There was an error exception meesage: " + ex + "</p>");
            out.println("</div>");

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
        } finally {
            out.close();
        }
    }

    //public java.sql.Date getCurrentDatetime() {
    //    java.util.Date today = new java.util.Date();
    //    return new java.sql.Date(today.getTime());
    //}
}
