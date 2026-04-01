package cod.ms.admin.Dto;

public class TipoProductoDTO {

    private Long idTipo;

    private String nombreTipo;

    public TipoProductoDTO(Long idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    public TipoProductoDTO(){

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
        return "TipoProductoDTO{" +
                "idTipo=" + idTipo +
                ", nombreTipo='" + nombreTipo + '\'' +
                '}';
    }
}
