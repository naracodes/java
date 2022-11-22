
function validarCadastro(){
    let pergunta = document.getElementById('pergunta').value;
    let tipoDeRespostaSelecionado = selecionarTipoDeResposta();
    
    if(pergunta == ""){
        document.getElementById('erro').innerHTML = "<strong>Ops! Digite sua pergunta.</strong>";
        document.getElementById('erro').removeAttribute('hidden');
        document.getElementById('pergunta').focus();
    }else if(tipoDeRespostaSelecionado == true){
        document.getElementById('erro').innerHTML = "PODE ENVIAR...";
        document.getElementById('form-criar').removeAttribute('onsubmit');
    }
}

function selecionarTipoDeResposta(){
    let resposta = document.getElementById('resposta').value;
    if(resposta == ""){
        document.getElementById('erro').innerHTML = "<strong>Ops! Selecione o tipo de Resposta!</strong>";
        document.getElementById('erro').removeAttribute('hidden');
        return false;
    }
    else if(resposta == "aberta"){
        document.getElementById('alt-a').setAttribute('hidden', true);
        document.getElementById('alt-b').setAttribute('hidden', true);
        document.getElementById('alt-c').setAttribute('hidden', true);
        document.getElementById('alt-d').setAttribute('hidden', true);
        document.getElementById('input-resposta').removeAttribute('hidden');
		document.getElementById('erro').setAttribute('hidden', true);
    }
    else if(resposta == "multipla"){
        document.getElementById('alt-a').removeAttribute('hidden');
        document.getElementById('alt-b').removeAttribute('hidden');
        document.getElementById('alt-c').removeAttribute('hidden');
        document.getElementById('alt-d').removeAttribute('hidden');
        document.getElementById('input-resposta').setAttribute('hidden', true); 
		document.getElementById('erro').setAttribute('hidden', true);		
    }
    else if(resposta == "dicotomica"){
        document.getElementById('alt-a').removeAttribute('hidden');
        document.getElementById('alt-b').removeAttribute('hidden');
        document.getElementById('alt-c').setAttribute('hidden', true);
        document.getElementById('alt-d').setAttribute('hidden', true);
        document.getElementById('input-resposta').setAttribute('hidden', true);
		document.getElementById('erro').setAttribute('hidden', true);
    }
}
