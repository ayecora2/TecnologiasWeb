function filterProductos()
{
	var filter = $("#filterProducto").val();
	
	$.ajax({
		  type: "POST",
		  url: "/FilterProducto",
		  data: filter,
		  success: function (returnval) {
			  	$("#containerProductos").html(returnval);
		  },
		  error: function (returnval) {
			  console.debug(returnval.responseText);
			  $("#containerProductos").html("<p style='color:red;'>No se han encontrado resultados debido a un error.</p>");
		  }
	
	});
}