/*function addCard() {
    let card = {
        name: document.getElementsByName('name').value,
        description: document.getElementsByName('description').value,
        family: document.getElementsByName('family').value,
        affinity: document.getElementsByName('affinity').value,
        imgUrl: document.getElementsByName('imgUrl').value,
        smallImgUrl: document.getElementsByName('smallImgUrl').value,
        energy: document.getElementsByName('energy').value,
        hp: document.getElementsByName('hp').value,
        defence: document.getElementsByName('defence').value,
        attack: document.getElementsByName('attack').value,
        price: document.getElementsByName('price').value,
        userId: document.getElementsByName('userId').value
    }
    console.log(JSON.stringify(card));
    $.ajax({
        url: "http://vps.cpe-sn.fr:8083/card",
        type: "POST",
        data: JSON.stringify(card),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            console.log("Card added");
        },
        failure: function (errMsg) {
            console.log("Error adding card");
        }
    });
}*/
$("#form-add-card").submit(function(e) {
    e.preventDefault();

    let form = $(this);
    let actionUrl = form.attr('action');

    let formData = {
        name: form.find('input[name="name"]').val(),
        description: form.find('input[name="description"]').val(),
        family: form.find('input[name="family"]').val(),
        affinity: form.find('input[name="affinity"]').val(),
        imgUrl: form.find('input[name="imgUrl"]').val(),
        smallImgUrl: form.find('input[name="smallImgUrl"]').val(),
        energy: form.find('input[name="energy"]').val(),
        hp: form.find('input[name="hp"]').val(),
        defence: form.find('input[name="defence"]').val(),
        attack: form.find('input[name="attack"]').val(),
        price: form.find('input[name="price"]').val(),
        userId: form.find('input[name="userId"]').val()
    };

    $.ajax({
        url: actionUrl,
        type: "POST",
        data: JSON.stringify(formData),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data) {
            console.log("Card added");
        },
        failure: function (errMsg) {
            console.log("Error adding card");
        }
    });
});