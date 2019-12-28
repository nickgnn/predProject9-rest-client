function getUsername() {
    //function which send ajax request to the server
    $.ajax({
        url : '/rest',
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
            $("#text3").text(data.password + '\n');
            $("#text4").text(data.role + '\n');
            $("#text5").text(data.role_id + '\n');
        }
    });
}


$(document).ready(function () {
    $('.table .editButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (user, status) {
            $('#editID').val(user.id);
            $('#editUsernameID').val(user.username);
            $('#editPsswrdID').val(user.password);
            $('#editAgeID').val(user.age);
            $('#editRoleID').val(user.role);
            $('#editRole_idID').val(user.role_id);
        });

        $('#editModal').modal();
    });

    $('.table .deleteButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');

        $('#deleteModal #deleteID').attr('href', href);

        $('#deleteModal').modal();
    });




    $('.addNewButton').on('click', function (event) {
        event.preventDefault();
        $('#addModal').modal();
    });


    $('#submitAddButton').on('click', function (event) {
        event.preventDefault();

        var form = $('#formAdd');

        $.ajax({
            type: "post",
            url: "/addNew",
            data: form.serialize(),
            success: function() {
                form.reset;
                $("#addModal").modal('hide');
                location.reload();
            },

            error: function () {
                alert('error in submit report form');
            }
        });

    });


});