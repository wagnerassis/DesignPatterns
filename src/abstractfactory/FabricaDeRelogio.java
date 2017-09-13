package abstractfactory;

/**
 *
 * @author Wagner Assis
 */
public interface FabricaDeRelogio {
    RelogioLuxo criarRelogioLuxo();
    RelogioNormal criarRelogioNormal();
}
