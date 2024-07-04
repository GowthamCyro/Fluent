const box1 = document.getElementById("nsc");
const box2 = document.getElementById("ur");
const box3 = document.getElementById("cc");
const box4 = document.getElementById("tc");
const box5 = document.getElementById("em1");
const box6 = document.getElementById("em2");



box1.addEventListener("click",(event)=>{
    setTimeout(() => {
        var redirectUrl = "NewServiceConnection/NewServiceConnection.html";
        window.location.href = redirectUrl;
    }, 1000)
});
box2.addEventListener("click",(event)=>{
    setTimeout(() => {
        var redirectUrl = "UtilityReports/UtilizationReport.html";
        window.location.href = redirectUrl;
    }, 1000)
});
box3.addEventListener("click",(event)=>{
    setTimeout(() => {
        var redirectUrl = "Complaints/CustomerComplaints.html";
        window.location.href = redirectUrl;
    }, 1000)
});


document.getElementById("logout").addEventListener("click", function() {
    window.location.href = "AdminLogin.html";
  });