$(function(){

    $('#date').daterangepicker({

        singleDatePicker: true,

        locale: {

        format: 'MM.DD.YYYY'

    }


});
    $('#startDate').daterangepicker({

        singleDatePicker: true,

        locale: {

            format: 'MM.DD.YYYY'

        }


    });

    $('#dateTime').daterangepicker({
        timePicker: true,
        timePickerIncrement: 30,
        locale: {
            format: 'MM/DD/YYYY h:mm A'
        }
    });

});
