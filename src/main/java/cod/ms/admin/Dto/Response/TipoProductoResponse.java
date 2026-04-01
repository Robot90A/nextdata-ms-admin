package cod.ms.admin.Dto.Response;

public class TipoProductoResponse {

    private Long idTipo;

    private String nombreTipo;

    public TipoProductoResponse(Long idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    public TipoProductoResponse(){

    }

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        return "TipoProductoResponse{" +
                "idTipo=" + idTipo +
                ", nombreTipo='" + nombreTipo + '\'' +
                '}';
    }
}
