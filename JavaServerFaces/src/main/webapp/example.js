function myFunction(msg) {
	alert("Message: " + msg);
}
function doNothing() {

}
function ajaxOnEvent(data) {
	console.log('>>>> ajaxOnEvent');
}
var handleAjax = function handleAjax(data) {
	var buttonElement = data.source; // The HTML DOM element which invoked
										// the ajax event.
	var ajaxStatus = data.status; // Can be "begin", "complete" and "success".

    var responseXML = data.responseXML;
    var responseText = data.responseText;
	
	switch (ajaxStatus) {
	case "begin": // This is called right before ajax request is been sent.
		console.log('>>>> Ajax begin')
		break;

	case "complete": // This is called right after ajax response is received.
		console.log('>>>> Ajax complete')
		break;

	case "success": // This is called when ajax response is successfully
					// processed.
		console.log('>>>> Ajax success')
		break;
	}
}


jsf.ajax.addOnEvent(handleAjax);
