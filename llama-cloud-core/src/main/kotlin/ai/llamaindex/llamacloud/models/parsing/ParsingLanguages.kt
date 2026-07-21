// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** Enum for representing the languages supported by the parser. */
class ParsingLanguages @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ABQ = of("abq")

        @JvmField val ADY = of("ady")

        @JvmField val AF = of("af")

        @JvmField val ANG = of("ang")

        @JvmField val AR = of("ar")

        @JvmField val AS = of("as")

        @JvmField val AVA = of("ava")

        @JvmField val AZ = of("az")

        @JvmField val BE = of("be")

        @JvmField val BG = of("bg")

        @JvmField val BGC = of("bgc")

        @JvmField val BH = of("bh")

        @JvmField val BHO = of("bho")

        @JvmField val BN = of("bn")

        @JvmField val BS = of("bs")

        @JvmField val CH_SIM = of("ch_sim")

        @JvmField val CH_TRA = of("ch_tra")

        @JvmField val CHE = of("che")

        @JvmField val CS = of("cs")

        @JvmField val CY = of("cy")

        @JvmField val DA = of("da")

        @JvmField val DAR = of("dar")

        @JvmField val DE = of("de")

        @JvmField val EN = of("en")

        @JvmField val ES = of("es")

        @JvmField val ET = of("et")

        @JvmField val FA = of("fa")

        @JvmField val FR = of("fr")

        @JvmField val GA = of("ga")

        @JvmField val GOM = of("gom")

        @JvmField val HI = of("hi")

        @JvmField val HR = of("hr")

        @JvmField val HU = of("hu")

        @JvmField val ID = of("id")

        @JvmField val INH = of("inh")

        @JvmField val IS = of("is")

        @JvmField val IT = of("it")

        @JvmField val JA = of("ja")

        @JvmField val KBD = of("kbd")

        @JvmField val KN = of("kn")

        @JvmField val KO = of("ko")

        @JvmField val KU = of("ku")

        @JvmField val LA = of("la")

        @JvmField val LBE = of("lbe")

        @JvmField val LEZ = of("lez")

        @JvmField val LT = of("lt")

        @JvmField val LV = of("lv")

        @JvmField val MAH = of("mah")

        @JvmField val MAI = of("mai")

        @JvmField val MI = of("mi")

        @JvmField val MN = of("mn")

        @JvmField val MNI = of("mni")

        @JvmField val MR = of("mr")

        @JvmField val MS = of("ms")

        @JvmField val MT = of("mt")

        @JvmField val NE = of("ne")

        @JvmField val NEW = of("new")

        @JvmField val NL = of("nl")

        @JvmField val NO = of("no")

        @JvmField val OC = of("oc")

        @JvmField val PI = of("pi")

        @JvmField val PL = of("pl")

        @JvmField val PT = of("pt")

        @JvmField val RO = of("ro")

        @JvmField val RS_CYRILLIC = of("rs_cyrillic")

        @JvmField val RS_LATIN = of("rs_latin")

        @JvmField val RU = of("ru")

        @JvmField val SA = of("sa")

        @JvmField val SCK = of("sck")

        @JvmField val SK = of("sk")

        @JvmField val SL = of("sl")

        @JvmField val SQ = of("sq")

        @JvmField val SV = of("sv")

        @JvmField val SW = of("sw")

        @JvmField val TA = of("ta")

        @JvmField val TAB = of("tab")

        @JvmField val TE = of("te")

        @JvmField val TH = of("th")

        @JvmField val TJK = of("tjk")

        @JvmField val TL = of("tl")

        @JvmField val TR = of("tr")

        @JvmField val UG = of("ug")

        @JvmField val UK = of("uk")

        @JvmField val UR = of("ur")

        @JvmField val UZ = of("uz")

        @JvmField val VI = of("vi")

        @JvmStatic fun of(value: String) = ParsingLanguages(JsonField.of(value))
    }

    /** An enum containing [ParsingLanguages]'s known values. */
    enum class Known {
        ABQ,
        ADY,
        AF,
        ANG,
        AR,
        AS,
        AVA,
        AZ,
        BE,
        BG,
        BGC,
        BH,
        BHO,
        BN,
        BS,
        CH_SIM,
        CH_TRA,
        CHE,
        CS,
        CY,
        DA,
        DAR,
        DE,
        EN,
        ES,
        ET,
        FA,
        FR,
        GA,
        GOM,
        HI,
        HR,
        HU,
        ID,
        INH,
        IS,
        IT,
        JA,
        KBD,
        KN,
        KO,
        KU,
        LA,
        LBE,
        LEZ,
        LT,
        LV,
        MAH,
        MAI,
        MI,
        MN,
        MNI,
        MR,
        MS,
        MT,
        NE,
        NEW,
        NL,
        NO,
        OC,
        PI,
        PL,
        PT,
        RO,
        RS_CYRILLIC,
        RS_LATIN,
        RU,
        SA,
        SCK,
        SK,
        SL,
        SQ,
        SV,
        SW,
        TA,
        TAB,
        TE,
        TH,
        TJK,
        TL,
        TR,
        UG,
        UK,
        UR,
        UZ,
        VI,
    }

    /**
     * An enum containing [ParsingLanguages]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ParsingLanguages] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ABQ,
        ADY,
        AF,
        ANG,
        AR,
        AS,
        AVA,
        AZ,
        BE,
        BG,
        BGC,
        BH,
        BHO,
        BN,
        BS,
        CH_SIM,
        CH_TRA,
        CHE,
        CS,
        CY,
        DA,
        DAR,
        DE,
        EN,
        ES,
        ET,
        FA,
        FR,
        GA,
        GOM,
        HI,
        HR,
        HU,
        ID,
        INH,
        IS,
        IT,
        JA,
        KBD,
        KN,
        KO,
        KU,
        LA,
        LBE,
        LEZ,
        LT,
        LV,
        MAH,
        MAI,
        MI,
        MN,
        MNI,
        MR,
        MS,
        MT,
        NE,
        NEW,
        NL,
        NO,
        OC,
        PI,
        PL,
        PT,
        RO,
        RS_CYRILLIC,
        RS_LATIN,
        RU,
        SA,
        SCK,
        SK,
        SL,
        SQ,
        SV,
        SW,
        TA,
        TAB,
        TE,
        TH,
        TJK,
        TL,
        TR,
        UG,
        UK,
        UR,
        UZ,
        VI,
        /**
         * An enum member indicating that [ParsingLanguages] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ABQ -> Value.ABQ
            ADY -> Value.ADY
            AF -> Value.AF
            ANG -> Value.ANG
            AR -> Value.AR
            AS -> Value.AS
            AVA -> Value.AVA
            AZ -> Value.AZ
            BE -> Value.BE
            BG -> Value.BG
            BGC -> Value.BGC
            BH -> Value.BH
            BHO -> Value.BHO
            BN -> Value.BN
            BS -> Value.BS
            CH_SIM -> Value.CH_SIM
            CH_TRA -> Value.CH_TRA
            CHE -> Value.CHE
            CS -> Value.CS
            CY -> Value.CY
            DA -> Value.DA
            DAR -> Value.DAR
            DE -> Value.DE
            EN -> Value.EN
            ES -> Value.ES
            ET -> Value.ET
            FA -> Value.FA
            FR -> Value.FR
            GA -> Value.GA
            GOM -> Value.GOM
            HI -> Value.HI
            HR -> Value.HR
            HU -> Value.HU
            ID -> Value.ID
            INH -> Value.INH
            IS -> Value.IS
            IT -> Value.IT
            JA -> Value.JA
            KBD -> Value.KBD
            KN -> Value.KN
            KO -> Value.KO
            KU -> Value.KU
            LA -> Value.LA
            LBE -> Value.LBE
            LEZ -> Value.LEZ
            LT -> Value.LT
            LV -> Value.LV
            MAH -> Value.MAH
            MAI -> Value.MAI
            MI -> Value.MI
            MN -> Value.MN
            MNI -> Value.MNI
            MR -> Value.MR
            MS -> Value.MS
            MT -> Value.MT
            NE -> Value.NE
            NEW -> Value.NEW
            NL -> Value.NL
            NO -> Value.NO
            OC -> Value.OC
            PI -> Value.PI
            PL -> Value.PL
            PT -> Value.PT
            RO -> Value.RO
            RS_CYRILLIC -> Value.RS_CYRILLIC
            RS_LATIN -> Value.RS_LATIN
            RU -> Value.RU
            SA -> Value.SA
            SCK -> Value.SCK
            SK -> Value.SK
            SL -> Value.SL
            SQ -> Value.SQ
            SV -> Value.SV
            SW -> Value.SW
            TA -> Value.TA
            TAB -> Value.TAB
            TE -> Value.TE
            TH -> Value.TH
            TJK -> Value.TJK
            TL -> Value.TL
            TR -> Value.TR
            UG -> Value.UG
            UK -> Value.UK
            UR -> Value.UR
            UZ -> Value.UZ
            VI -> Value.VI
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ABQ -> Known.ABQ
            ADY -> Known.ADY
            AF -> Known.AF
            ANG -> Known.ANG
            AR -> Known.AR
            AS -> Known.AS
            AVA -> Known.AVA
            AZ -> Known.AZ
            BE -> Known.BE
            BG -> Known.BG
            BGC -> Known.BGC
            BH -> Known.BH
            BHO -> Known.BHO
            BN -> Known.BN
            BS -> Known.BS
            CH_SIM -> Known.CH_SIM
            CH_TRA -> Known.CH_TRA
            CHE -> Known.CHE
            CS -> Known.CS
            CY -> Known.CY
            DA -> Known.DA
            DAR -> Known.DAR
            DE -> Known.DE
            EN -> Known.EN
            ES -> Known.ES
            ET -> Known.ET
            FA -> Known.FA
            FR -> Known.FR
            GA -> Known.GA
            GOM -> Known.GOM
            HI -> Known.HI
            HR -> Known.HR
            HU -> Known.HU
            ID -> Known.ID
            INH -> Known.INH
            IS -> Known.IS
            IT -> Known.IT
            JA -> Known.JA
            KBD -> Known.KBD
            KN -> Known.KN
            KO -> Known.KO
            KU -> Known.KU
            LA -> Known.LA
            LBE -> Known.LBE
            LEZ -> Known.LEZ
            LT -> Known.LT
            LV -> Known.LV
            MAH -> Known.MAH
            MAI -> Known.MAI
            MI -> Known.MI
            MN -> Known.MN
            MNI -> Known.MNI
            MR -> Known.MR
            MS -> Known.MS
            MT -> Known.MT
            NE -> Known.NE
            NEW -> Known.NEW
            NL -> Known.NL
            NO -> Known.NO
            OC -> Known.OC
            PI -> Known.PI
            PL -> Known.PL
            PT -> Known.PT
            RO -> Known.RO
            RS_CYRILLIC -> Known.RS_CYRILLIC
            RS_LATIN -> Known.RS_LATIN
            RU -> Known.RU
            SA -> Known.SA
            SCK -> Known.SCK
            SK -> Known.SK
            SL -> Known.SL
            SQ -> Known.SQ
            SV -> Known.SV
            SW -> Known.SW
            TA -> Known.TA
            TAB -> Known.TAB
            TE -> Known.TE
            TH -> Known.TH
            TJK -> Known.TJK
            TL -> Known.TL
            TR -> Known.TR
            UG -> Known.UG
            UK -> Known.UK
            UR -> Known.UR
            UZ -> Known.UZ
            VI -> Known.VI
            else -> throw LlamaCloudInvalidDataException("Unknown ParsingLanguages: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LlamaCloudInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ParsingLanguages = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaCloudInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ParsingLanguages && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
