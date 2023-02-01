$.ajax({
    url: "http://vps.cpe-sn.fr:8083/card/8",
    type: "GET",
    success: function(data){
        console.log(data);
        $('#cardFamilyImgId')[0].src = data.family.img;
        $('#cardFamilyNameId')[0].innerText=data.family.name;
        $('#cardImgId')[0].src=data.img;
        $('#cardNameId')[0].innerText=data.name;
        $('#cardDescriptionId')[0].innerText=data.description;
        $('#cardHPId')[0].innerText=data.hp;
        $('#cardEnergyId')[0].innerText=data.energy;
        $('#cardAttackId')[0].innerText=data.attack;
        $('#cardDefenceId')[0].innerText=data.defence;
    }
});
function loadCard(id){
    $.ajax({
        url: "http://vps.cpe-sn.fr:8083/card/" + id,
        type: "GET",
        success: function(data){
            console.log(data);
            $('#cardFamilyImgId')[0].src = data.family.img;
            $('#cardFamilyNameId')[0].innerText=data.family.name;
            $('#cardImgId')[0].src=data.img;
            $('#cardNameId')[0].innerText=data.name;
            $('#cardDescriptionId')[0].innerText=data.description;
            $('#cardHPId')[0].innerText=data.hp;
            $('#cardEnergyId')[0].innerText=data.energy;
            $('#cardAttackId')[0].innerText=data.attack;
            $('#cardDefenceId')[0].innerText=data.defence;
        }
    });
}