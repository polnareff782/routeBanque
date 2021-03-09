  /*
  
  document.querySelector('#redirection').innerHTML ="<button type='submit' class='btn btn-success btn-block' id='btnAnnuler'>Activer</button>";
  document.getElementById('btnAnnuler').addEventListener('click', function(){ Annuler(); });
*/
//function Annuler(){
//
//
//  document.querySelector('#redirection').innerHTML =" <br><br><button type='submit' class='btn btn-danger btn-block' id='btnRedireger'>Désactiver</button> <br><br>";
//
//operation.setAttribute('disabled','disabled');
//}


function opposition(){
    
 btnRedireger.setAttribute('disabled','disabled');
    
}


/* function de l'opposition*/

var collapseElementList = [].slice.call(document.querySelectorAll('.collapse'))
var collapseList = collapseElementList.map(function (collapseEl) {
  return new bootstrap.Collapse(collapseEl)
})
