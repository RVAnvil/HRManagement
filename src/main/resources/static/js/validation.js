console.log("welcome from js");
const empDetailsForm = document.querySelector("#empDetailsForm");
function showMsg(){
    swal({
        title: "Warning",
        text: "Please enter valid details",
        icon: "warning",
        button: "Ok",
      });
}


function validateFrom() {
    var name = document.forms["empDetailsForm"]['emp-name'].value;
    var email = document.forms["empDetailsForm"]['emp-email'].value;
    
    if (ValidateName(name) && ValidateEmail(email)) {
        return true;
    } else {
        showMsg();
        return false;
    }
}


function ValidateName(name) {
    var regex = /^[a-zA-Z ]{2,30}$/;
    let isValid = regex.test(name)
    if (!isValid || name.trim().length == 0) {
        var Error = document.getElementById('error').innerHTML = `<p>Please enter valid Name</p>`
        document.getElementById('emp-name').value = '';
        return false;
    }
    return true;
}

/* Function for validating email */

function ValidateEmail(email) {
    var regex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    let isValid = regex.test(String(email).toLowerCase());
    if (!isValid) {
        var Error = document.getElementById('error').innerHTML = `<p>Please enter valid email id</p>`
        document.getElementById('emp-email').value = '';
        return false;
    }
    return true;
}

function onFormSubmit(e) {
    
    if(validateFrom()){
        console.log("in if")
        return true
    }else{
        console.log("in selse")
        return false
    }
}

empDetailsForm.addEventListener('submit', onFormSubmit);