function validateAddNewApartmen() {
    var valid = true;
    if (
            document.getElementById("apartmentnumber").value.search(/^[0-9]{1,}$/) != 0) {
        valid = false;
        document.getElementById("errApartmentnumber").innerHTML =
                "ERROR: Apartment Number is mandatory, Should be only digits ( 0-9 ) !";
        document.getElementById("errApartmentnumber").style.display = "inline";
    } else {
        document.getElementById("errApartmentnumber").innerHTML = "";
        document.getElementById("errApartmentnumber").style.display = "none";
    }
    //
    if (
            document.getElementById("floornumber").value ==
            "Please select the floor number..."
            ) {
        valid = false;
        document.getElementById("errFloornumber").innerHTML =
                "ERROR: Select the floor number !";
        document.getElementById("errFloornumber").style.display = "inline";
    } else {
        document.getElementById("errFloornumber").innerHTML = "";
        document.getElementById("errFloornumber").style.display = "none";
    }
    //
    if (document.getElementById("numberofrooms").value.search(/^[0-9]{1,}$/) != 0) {
        valid = false;
        document.getElementById("errNumberofrooms").innerHTML =
                "ERROR: Number Of Rooms is mandatory, Should be only digits ( 0-9 ) !";
        document.getElementById("errNumberofrooms").style.display = "inline";
    } else {
        document.getElementById("errNumberofrooms").innerHTML = "";
        document.getElementById("errNumberofrooms").style.display = "none";
    }
    //
    if (document.getElementById("occupied").value == "Please select 0 or 1...") {
        valid = false;
        document.getElementById("errOccupied").innerHTML = "ERROR: Select 0 or 1 !";
        document.getElementById("errOccupied").style.display = "inline";
    } else {
        document.getElementById("errOccupied").innerHTML = "";
        document.getElementById("errOccupied").style.display = "none";
    }
    //
    if (document.getElementById("price").value.search(/^[0-9]{1,}$/) != 0) {
        valid = false;
        document.getElementById("errPrice").innerHTML = "ERROR: Price is mandatory, Should be only digits ( 0-9 ) !";
        document.getElementById("errPrice").style.display = "inline";
    } else {
        document.getElementById("errPrice").innerHTML = "";
        document.getElementById("errPrice").style.display = "none";
    }
    //
    if (document.getElementById("payment").value.search(/^[0-9]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errPayment").innerHTML =
                "ERROR: Payment is optional, Should be only digits ( 0-9 ) !";
        document.getElementById("errPayment").style.display = "inline";
    } else {
        document.getElementById("errPayment").innerHTML = "";
        document.getElementById("errPayment").style.display = "none";
    }
    //
    if (document.getElementById("paymentdatetime").value.search(/^[a-zA-Z0-9'\(\)\#\,\-\:\._ ]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errPaymentdatetime").innerHTML =
                "ERROR: Payment DateTime is optional, only contains( A-Za-z , 0-9 , # , . , - , _ , () , : , , ) !";
        document.getElementById("errPaymentdatetime").style.display = "inline";
    } else {
        document.getElementById("errPaymentdatetime").innerHTML = "";
        document.getElementById("errPaymentdatetime").style.display = "none";
    }
    //
    if (document.getElementById("rentstartdate").value.search(/^[a-zA-Z0-9'\(\)\#\,\-\:\._ ]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errRentstartdate").innerHTML =
                "ERROR: Rent Start Date is optional, only contains( A-Za-z , 0-9 , # , . , - , _ , () , : , , ) !";
        document.getElementById("errRentstartdate").style.display = "inline";
    } else {
        document.getElementById("errRentstartdate").innerHTML = "";
        document.getElementById("errRentstartdate").style.display = "none";
    }
    //
    if (document.getElementById("rentenddate").value.search(/^[a-zA-Z0-9'\(\)\#\,\-\:\._ ]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errRentenddate").innerHTML =
                "ERROR: Rent End Date is optional, only contains( A-Za-z , 0-9 , # , . , - , _ , () , : , , ) !";
        document.getElementById("errRentenddate").style.display = "inline";
    } else {
        document.getElementById("errRentenddate").innerHTML = "";
        document.getElementById("errRentenddate").style.display = "none";
    }
    //
    if (document.getElementById("renternationalid").value.search(/^[0-9]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errRenternationalid").innerHTML =
                "ERROR: Renter National ID is optional, Should be only digits ( 0-9 ) !";
        document.getElementById("errRenternationalid").style.display = "inline";
    } else {
        document.getElementById("errRenternationalid").innerHTML = "";
        document.getElementById("errRenternationalid").style.display = "none";
    }
    //
    if (document.getElementById("rentername").value.search(/^[A-Za-z'\-\._ ]{0,}$/) != 0) {
        valid = false;
        document.getElementById("errRentername").innerHTML =
                "ERROR: Renter Name is optional, Should be only characters !";
        document.getElementById("errRentername").style.display = "inline";
    } else {
        document.getElementById("errRentername").innerHTML = "";
        document.getElementById("errRentername").style.display = "none";
    }
    if (valid == false) {
        return false; // don't submit the form data to the server because of any validation error(s)
    } else {
        return true; // submit the form data to the server because all data looks correct without errors
    }
}

/////////////////

function validateFeedback() {
    var valid = true;
    if (document.getElementById("name").value.search(/^[A-Za-z'\-\._ ]{6,}$/) != 0) {
        valid = false;
        document.getElementById("errName").innerHTML = "ERROR: Name is mandatory, Should be at least 6 characters !";
        document.getElementById("errName").style.display = "inline";
    } else {
        document.getElementById("errName").innerHTML = "";
        document.getElementById("errName").style.display = "none";
    }
    //
    if (document.getElementById("phone").value.search(/^(05\d{8}|9665\d{8})$/) != 0) {
        valid = false;
        document.getElementById("errPhone").innerHTML =
                "ERROR: Phone is mandatory, Should be look like (966xxxxxxxxx OR 05xxxxxxxx) !";
        document.getElementById("errPhone").style.display = "inline";
    } else {
        document.getElementById("errPhone").innerHTML = "";
        document.getElementById("errPhone").style.display = "none";
    }
    //
    if (document.getElementById("email").value.search(/^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/) != 0) {
        valid = false;
        document.getElementById("errEmail").innerHTML =
                "ERROR: Email is mandatory, Should be correct email address !";
        document.getElementById("errEmail").style.display = "inline";
    } else {
        document.getElementById("errEmail").innerHTML = "";
        document.getElementById("errEmail").style.display = "none";
    }
    //
    if (document.getElementById("subject").value.search(/^[a-zA-Z0-9'\(\)\#\,\-\:\._ ]{3,}$/) != 0) {
        valid = false;
        document.getElementById("errSubject").innerHTML =
                "ERROR: Subject is mandatory, Should be at least 3 characters And only contains( A-Za-z , 0-9 , # , . , - , _ , () , : , , ) !";
        document.getElementById("errSubject").style.display = "inline";
    } else {
        document.getElementById("errSubject").innerHTML = "";
        document.getElementById("errSubject").style.display = "none";
    }
    //
    if (document.getElementById("type").value == "Please select a type...") {
        valid = false;
        document.getElementById("errType").innerHTML = "ERROR: Select a type !";
        document.getElementById("errType").style.display = "inline";
    } else {
        document.getElementById("errType").innerHTML = "";
        document.getElementById("errType").style.display = "none";
    }
    //
    if (document.getElementById("message").value.replace(/\s/g, "").length <= 0) {
        valid = false;
        document.getElementById("errMessage").innerHTML =
                "ERROR: Message is mandatory !";
        document.getElementById("errMessage").style.display = "inline";
    } else {
        document.getElementById("errMessage").innerHTML = "";
        document.getElementById("errMessage").style.display = "none";
    }
    if (valid == false) {
        return false; // don't submit the form data to the server because of any validation error(s)
    } else {
        return true; // submit the form data to the server because all data looks correct without errors
    }
}

