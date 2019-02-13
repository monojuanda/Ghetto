$(document).ready(function() {
    var contador = 0;
    $("#btn-cart").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart1").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart2").click(function() {
        $("#badge-cart").text(contador++); 
    });
    $("#btn-cart3").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart4").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart5").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart6").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart7").click(function() {
        $("#badge-cart").text(contador++);
    });
    $("#btn-cart8").click(function() {
        $("#badge-cart").text(contador++);
    });
    
    $("#btn-cart9").click(function() {
        if (contador > 0) {
            $("#badge-cart").text(--contador); 
        }
        
    });
    
    
    // (contador--) restar producto
});


