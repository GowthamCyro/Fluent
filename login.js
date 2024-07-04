function getApiData(event){
    event.preventDefault();

    let id = $("#aid").val();
    let password = $("#apass").val();

    $.ajax({
        url : `http://localhost:8080/getAdmin/${id}`,
        type : "GET",
        success: function(data){
            if(id == data.aid && password == data.apass)
                {
                    setTimeout(() => {
                        var redirectUrl = "AdminDashBoard.html";
                        window.location.href = redirectUrl;
                    }, 1000)
                }
            else
            {
                window.alert(`password Doesn't Match`);
            }    
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.error("POST API ERROR :: " + textStatus + ": " + errorThrown);
        }
    });
}