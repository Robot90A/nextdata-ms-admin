package cod.ms.admin.Dto.Request;

public class TipoProductoRequest {

    private String nombreTipo;

    public TipoProductoRequest(Long idTipo, String nombreTipo){

        this.nombreTipo = nombreTipo;
    }

    public TipoProductoRequest(){

    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        return "TipoProductoRequest{" +
                "nombreTipo='" + nombreTipo + '\'' +
                '}';
    }
}
