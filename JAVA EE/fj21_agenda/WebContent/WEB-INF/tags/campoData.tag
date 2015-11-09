<%@ tag language="java" pageEncoding="ISO-8859-1"%>

<%@ attribute name="id" required="true" %>

<input id="${id }" name = "${id}" />
<script> 
	//$("#${id}").datepicker({dateFormat:'dd/mm/yy'});
	
	$(function() {
	    $( "#${id}" ).datepicker({
	      showOn: "button",
	      buttonImage: "images/calendar.gif",
	      buttonImageOnly: true,
	      buttonText: "Select date"
	    });
	  });
	
</script>
