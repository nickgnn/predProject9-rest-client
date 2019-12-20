function myFunction() {
    //function which send ajax request to the server
    $.ajax({
        url : '/adminRest',
        datatype : 'json',
        type : "post",
        contentType : "application/json",
        data : JSON.stringify({
            username : 'Nick',
            id : 1,
            age : 31
        }),

        success : function(data) {
            console.log(data);
            $("#text1").text(data.age);
        }
    });
}