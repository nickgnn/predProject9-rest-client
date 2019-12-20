function getUsername() {
    //function which send ajax request to the server
    $.ajax({
        url : '/adminRest',
        datatype : 'json',
        type : "post",
        contentType : "application/json",
        data : JSON.stringify({
            id : '2'
        }),

        success : function(data) {
            console.log(data);
            $("#text1").text(data.password).text(data.username).text(data.age);
        }
    });
}

function getAge() {
    //function which send ajax request to the server
    $.ajax({
        url : '/adminRest',
        datatype : 'json',
        type : "post",
        contentType : "application/json",
        data : JSON.stringify({
            age : '31'
        }),

        success : function(data) {
            console.log(data);
            $("#text2").text(data.age);
        }
    });
}

function getUser() {
    //function which send ajax request to the server
    $.ajax({
        url : '/adminRest',
        datatype : 'json',
        type : "post",
        contentType : "application/json",
        data : JSON.stringify({
        }),

        success : function(data) {
            console.log(data);
            $("#text3").text(data);
        }
    });
}