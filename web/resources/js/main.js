function sortTable(n) {
  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
  table = document.getElementById("TablaCarta");
  switching = true;
  dir = "asc";
  while (switching) {
    switching = false;
    rows = table.getElementsByTagName("TR");
    for (i = 1; i < (rows.length - 1); i++) {
      shouldSwitch = false;
      x = rows[i].getElementsByTagName("TD")[n];
      y = rows[i + 1].getElementsByTagName("TD")[n];
      if (dir == "asc") {
        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
          shouldSwitch= true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
      switchcount ++;
    } else {
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
    $(function() {
        $("#h1object").click(function() {
            $.ajax({  
                async: true,
                url: "/MiMazo/Home/indexajax",
                method: "post",
                dataType: "json",
                
                beforeSend: function() {
                    $("#h1object").html("Cargando...");
                        },
                       
                success: function(data) {
                    $("#h1object").html("Cartas de Mi Mazo!");
                    var ac = "";
                    ac += "<table id='TablaCarta' class='table table-bordered table-hover'>";
                    ac += "<thead>";
                    ac += "<tr>";
                    ac += "<th width=187>Imagen</th>";
                    ac += "<th onclick='sortTable(1)'>ID</th>";
                    ac += "<th onclick='sortTable(2)' width=230>Nombre</th>";
                    ac += "<th onclick='sortTable(3)' width=170>Tipo</th>";
                    ac += "<th onclick='sortTable(4)'>ATK</th>";
                    ac += "<th onclick='sortTable(5)'>DEF</th>";
                    ac += "<th onclick='sortTable(6)'>Nivel</th>";
                    ac += "<th onclick='sortTable(7)' width=66>Atributo</th>";
                    ac += "<th max-width=470>Descripcion</th>";
                    ac += "<th onclick='sortTable(9)'>Precio</th>";
                    ac += "<th>Accion</th>";
                    ac += "</tr>";
                    ac += "</thead>";
                    ac += "<tbody>";
                    $.each(data, function(index, item) {
                        console.log(item.imagen);
                        ac += "<tr style='vertical-align:middle; text-align:center'><td><img src='/MiMazo/resources/img/" + item.imagen[0].url + "' width= 170 type='button' data-toggle='modal' data-target='#CartaImagen" + item.id + "'></td><div class='modal fade' id='CartaImagen" + item.id + "' role='dialog'><div class='modal-dialog modal-sm'><div class='modal-content' style='width:520px;'><div class='modal-header'><button type='button' class='close' data-dismiss='modal'>&times;</button><h4 class='modal-title'>Imagen de la Carta de "+item.nombre+"</h4></div><div align=center class='modal-body'><img src='/MiMazo/resources/img/" + item.imagen[0].url + "' height=615></div><div class='modal-footer'><button type='button' class='btn btn-default' data-dismiss='modal'>Close</button></div></div></div></div></div>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.id + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.nombre + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.tipo + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.atk + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.def + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.nivel + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'><img src='/MiMazo/resources/img/" + item.imagen[2].url + "' width= 66 height = 66>" + item.atributo + "</td>";
                        ac += "<td style='vertical-align:middle; text-align:center'><div onclick='toggle" + item.id + "()' id='desc" + item.id + "'>Mostrar</div><p style='text-align:left' onclick='toggle" + item.id + "()' id='p" + item.id + "'>" + item.descripcion + "</p><script>function toggle"+item.id+"() {$(document).ready(function() {$('#p"+item.id+"').toggle();$('#desc"+item.id+"').toggle();});}</script></td>";
                        ac += "<td style='vertical-align:middle; text-align:center'>" + item.precio + " CLP</td>";
                        ac += "<td style='vertical-align:middle; text-align:center' width= 100><button type='button' class='btn btn-primary btn-lg' data-toggle='modal' data-target='#Comprar" + item.id + "'>Comprar Carta ID " + item.id + "</button></td></tr><div class='modal fade' id='Comprar" + item.id + "' role='dialog'><div class='modal-dialog modal-lg'><div class='modal-content'><div class='modal-header'><button type='button' class='close' data-dismiss='modal'>&times;</button><h4 class='modal-title'>Comprar Carta de "+item.nombre+"</h4></div><div align=center class='modal-body'><img src='/MiMazo/resources/img/" + item.imagen[1].url + "' height=615></div><div class='modal-footer'><button type='button' class='btn btn-success' onclick='alert"+item.id+"()' data-dismiss='modal'>Comprar!</button><script>function alert"+item.id+"() {alert('Gracias por Comprar la Carta ID "+item.id+"');}</script><button type='button' class='btn btn-default' data-dismiss='modal'>Close</button></div></div></div></div></div>";
                    });
                    ac += "</tbody></table>";
                    $("#cuerpoajax").html(ac);
                },  
               
                error: function() {
                    $("#h1object").html("Hubo un error en el servicio");
                },
                timeout: 10000,  
            });
        });
    });
