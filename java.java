var randcolor = ['#0000FF','#808080','#00FF00','#FFFF00','#add8e6','#000000'];
    var cIndex = 0;
    function randomcolor(){
        var rand = Math.floor(Math.random() * 6);
        var i = document.getElementById("moto");
        i.style.backgroundColor = randcolor[rand];
}
function generatecolor(){
    var select = document.getElementById("dropdownmenu").value;
    if (select == "0")
		{
			document.getElementById("moto").style.backgroundColor = "black";
		}
	else if (select == "1")
		{
			document.getElementById("moto").style.backgroundColor = "green";
		}
    else if (select == "2")
		{
			document.getElementById("moto").style.backgroundColor = "grey";
		}
    else if (select == "3")
		{
			document.getElementById("moto").style.backgroundColor = "yellow";
		}
    else if (select == "4")
		{
			document.getElementById("moto").style.backgroundColor = "blue";
		}
    else if(select == "5")
		{
			document.getElementById("moto").style.backgroundColor = "lightblue";
		}
   
}

function reset(){
    document.getElementById("moto").style.backgroundColor = "white";
}
