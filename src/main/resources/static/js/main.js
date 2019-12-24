function getUsername() {
    //function which send ajax request to the server
    $.ajax({
        url : '/users',
        datatype : 'json',
        type : "post",
        contentType : "application/json",
        data : JSON.stringify({
            id : '2'
        }),

        success : function(data) {
            console.log(data);
            $("#text1").text(data.username + '\n');
            $("#text2").text(data.age + '\n');
            $("#text3").text(data.password)
        }
    });
}