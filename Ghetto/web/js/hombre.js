$(document).ready(function() {
    var contador = 1;
    $("#btn-cart").click(function() {
        $("#badge-cart").text(contador++);
    });
});