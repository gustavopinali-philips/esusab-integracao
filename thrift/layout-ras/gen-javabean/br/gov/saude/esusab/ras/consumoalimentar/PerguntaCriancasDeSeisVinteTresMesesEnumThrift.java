/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.consumoalimentar;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum PerguntaCriancasDeSeisVinteTresMesesEnumThrift implements org.apache.thrift.TEnum {
  A_CRIANCA_ONTEM_TOMOU_LEITE_PEITO(21),
  ONTEM_A_CRIANCA_COMEU_FRUTA_INTEIRA_PEDACO_AMASSADO(22),
  SE_SIM_QUANTAS_VEZES(23),
  ONTEM_A_CRIANCA_COMEU_COMIDA_DE_SAL(24),
  SE_COMEU_COMIDA_DE_SAL_QUANTAS_VEZES(25),
  SE_SIM_ESSA_COMIDA_FOI_OFERECIDA(26),
  OUTRO_LEITE_QUE_NAO_LEITE_DO_PEITO(28),
  MINGAU_COM_LEITE(29),
  IOGURTE(30),
  LEGUMES(31),
  VEGETAL_OU_FRUTAS_COR_ALARANJADA_OU_FOLHAS_ESCURAS(32),
  VERDURA_DE_FOLHA(33),
  CARNE(34),
  FIGADO(35),
  FEIJAO(36),
  ARROZ_BATATA_INHAME_MANDIOCA_FARINHA_MACARRAO(37),
  HAMBURGUER_E_OU_EMBUTIDOS(38),
  BEBIDAS_ADOCADAS(39),
  MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS(40),
  BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS(41);

  private final int value;

  private PerguntaCriancasDeSeisVinteTresMesesEnumThrift(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PerguntaCriancasDeSeisVinteTresMesesEnumThrift findByValue(int value) { 
    switch (value) {
      case 21:
        return A_CRIANCA_ONTEM_TOMOU_LEITE_PEITO;
      case 22:
        return ONTEM_A_CRIANCA_COMEU_FRUTA_INTEIRA_PEDACO_AMASSADO;
      case 23:
        return SE_SIM_QUANTAS_VEZES;
      case 24:
        return ONTEM_A_CRIANCA_COMEU_COMIDA_DE_SAL;
      case 25:
        return SE_COMEU_COMIDA_DE_SAL_QUANTAS_VEZES;
      case 26:
        return SE_SIM_ESSA_COMIDA_FOI_OFERECIDA;
      case 28:
        return OUTRO_LEITE_QUE_NAO_LEITE_DO_PEITO;
      case 29:
        return MINGAU_COM_LEITE;
      case 30:
        return IOGURTE;
      case 31:
        return LEGUMES;
      case 32:
        return VEGETAL_OU_FRUTAS_COR_ALARANJADA_OU_FOLHAS_ESCURAS;
      case 33:
        return VERDURA_DE_FOLHA;
      case 34:
        return CARNE;
      case 35:
        return FIGADO;
      case 36:
        return FEIJAO;
      case 37:
        return ARROZ_BATATA_INHAME_MANDIOCA_FARINHA_MACARRAO;
      case 38:
        return HAMBURGUER_E_OU_EMBUTIDOS;
      case 39:
        return BEBIDAS_ADOCADAS;
      case 40:
        return MACARRAO_INSTANTANEO_SALGADINHOS_BISCOITOS;
      case 41:
        return BISCOITO_RECHEADO_DOCES_OU_GULOSEIMAS;
      default:
        return null;
    }
  }
}
