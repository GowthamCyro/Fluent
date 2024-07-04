function postApiData(event) {
    event.preventDefault();
    let k = $("#aid").val();
    var modelObj = {
        aid: Number(k),
        aname: $("#aname").val(),
        apass: $("#apass").val()
    };

    console.log(modelObj);

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/postNewAdmin",
        headers: {
            "Content-Type": "application/json"
        },
        data: JSON.stringify(modelObj),
        success: function(data) {
            console.log("POST API RESPONSE ::" + data);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.error("POST API ERROR :: " + textStatus + ": " + errorThrown);
        }
    });
}
