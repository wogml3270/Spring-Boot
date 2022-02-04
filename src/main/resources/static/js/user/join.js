(function (){
    'use strict'

    var form = document.querySelector('#join_frm');
    form.addEventListener('submit', (e) =>{
        if(form.checkValidity() === false) {
            e.preventDefault();
            e.stopPropagation();
        }
        form.classList.add('was-validated');
    }, false);
})();