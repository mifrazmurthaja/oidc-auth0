$(document).ready(function(){
    $.ajax({
        url: "authresponse",
        success: function(result){
            $("#pre_json").removeClass("prettyprinted");
            var jsonObj = JSON.parse(result);
            var jsonPretty = JSON.stringify(jsonObj, null, '\t');
            $("#pre_json").html(PR.prettyPrintOne(jsonPretty));
        }
    });

    $.ajax({
        url: "id_token",
        success: function(result){
            $("#pre_id_token").removeClass("prettyprinted");
            var jsonObj = JSON.parse(result);
            var jsonPretty = JSON.stringify(jsonObj, null, '\t');
            $("#pre_id_token").html(PR.prettyPrintOne(jsonPretty));
        }
    });
});