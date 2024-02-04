$(document).ready(function () {
    $('#centeredImage').hover(
        function () {
            $(this).css('box-shadow', '0 0 20px rgba(0, 0, 0, 0.8)');
        },
        function () {
            $(this).css('box-shadow', '0 0 10px rgba(0, 0, 0, 0.5)');
        }
    );
});

