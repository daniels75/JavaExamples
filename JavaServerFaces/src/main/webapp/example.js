	function myFunction(msg) {
	    alert("Message: " + msg);
	}
	function handleAjax(data) {
		  var buttonElement = data.source; // The HTML DOM element which invoked the ajax event.
		    var ajaxStatus = data.status; // Can be "begin", "complete" and "success".

		    switch (ajaxStatus) {
		        case "begin": // This is called right before ajax request is been sent.
		            buttonElement.disabled = true;
		            break;

		        case "complete": // This is called right after ajax response is received.
		            // We don't want to enable it yet here, right?
		            break;

		        case "success": // This is called when ajax response is successfully processed.
		            buttonElement.disabled = false;
		            break;
		    }
	}