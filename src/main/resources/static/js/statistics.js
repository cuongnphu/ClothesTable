$(document).ready(function () {
    $("select[id*=teamId]").change(function () {
        var team_id = $("select[id*=teamId]").val();
        window.location.replace('/statistics/'+team_id);
    });

    $("#statistic").click(function () {
        var txtName = $("select[id*=name]").val();
        var txtTeamId = $("select[id*=teamId]").val();
        $.post("/statistic", {name: txtName, team_id: txtTeamId}, function(result){
            var str = JSON.stringify(result);
            var json = JSON.parse(str);
            $("#report > tr > td > div[class=\"container-fluid\"]").empty();
            if(txtTeamId == 1){
                $("#report > .tb-row > #name").text(txtName);
                $("#report > .tb-row > #teamId").text("In");
                var totalall = 0;
                for(var i = 0; i < json.printerList.length; i++){
                    var index = i+1;
                    var nameTable = json.orderTableList[i].name;
                    var price = json.printerList[i].price;
                    var quantity = json.printerList[i].quantity;
                    var total = json.printerList[i].total;
                    totalall = totalall + total;
                    $("#report > tr > td > div[class=\"container-fluid\"]").append("<div class='row' style='border: 1px dashed darkgrey'>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "</div>");
                    if(i > 0){
                        if(nameTable != json.orderTableList[i-1].name)
                            $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }else{
                        $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(2)").text(price);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(3)").text(quantity);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(4)").text(total.toLocaleString('en'));
                }
                $("#report > .tb-row > #totalall").text(totalall.toLocaleString('en'));
            }else if(txtTeamId == 2){
                $("#report > .tb-row > #name").text(txtName);
                $("#report > .tb-row > #teamId").text("Thêu");
                var totalall = 0;
                for(var i = 0; i < json.embroideryList.length; i++){
                    var index = i+1;
                    var nameTable = json.orderTableList[i].name;
                    var price = json.embroideryList[i].price;
                    var quantity = json.embroideryList[i].quantity;
                    var total = json.embroideryList[i].total;
                    totalall = totalall + total;
                    $("#report > tr > td > div[class=\"container-fluid\"]").append("<div class='row' style='border: 1px dashed darkgrey'>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "</div>");
                    if(i > 0){
                        if(nameTable != json.orderTableList[i-1].name)
                            $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }else{
                        $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(2)").text(price);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(3)").text(quantity);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(4)").text(total.toLocaleString('en'));
                }
                $("#report > .tb-row > #totalall").text(totalall.toLocaleString('en'));
            }else if(txtTeamId == 3){
                $("#report > .tb-row > #name").text(txtName);
                $("#report > .tb-row > #teamId").text("May");
                var totalall = 0;
                for(var i = 0; i < json.sewingList.length; i++){
                    var index = i+1;
                    var nameTable = json.orderTableList[i].name;
                    var price = json.sewingList[i].price;
                    var quantity = json.sewingList[i].quantity;
                    var total = json.sewingList[i].total;
                    totalall = totalall + total;
                    $("#report > tr > td > div[class=\"container-fluid\"]").append("<div class='row' style='border: 1px dashed darkgrey'>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "<div class='col-sm-3'></div>" +
                        "</div>");
                    if(i > 0){
                        if(nameTable != json.orderTableList[i-1].name)
                            $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }else {
                        $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(1)").text(nameTable);
                    }
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(2)").text(price);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(3)").text(quantity);
                    $("#report > tr > td > div[class=\'container-fluid\'] > div:nth-of-type("+index+") > div.col-sm-3:nth-of-type(4)").text(total.toLocaleString('en'));
                }
                $("#report > .tb-row > #totalall").text(totalall.toLocaleString('en'));
            }
        });
    })


})

