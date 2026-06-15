// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.annotation.JsonCreator
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException

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

        @JvmField val AF = of("af")

        @JvmField val AZ = of("az")

        @JvmField val BS = of("bs")

        @JvmField val CS = of("cs")

        @JvmField val CY = of("cy")

        @JvmField val DA = of("da")

        @JvmField val DE = of("de")

        @JvmField val EN = of("en")

        @JvmField val ES = of("es")

        @JvmField val ET = of("et")

        @JvmField val FR = of("fr")

        @JvmField val GA = of("ga")

        @JvmField val HR = of("hr")

        @JvmField val HU = of("hu")

        @JvmField val ID = of("id")

        @JvmField val IS = of("is")

        @JvmField val IT = of("it")

        @JvmField val KU = of("ku")

        @JvmField val LA = of("la")

        @JvmField val LT = of("lt")

        @JvmField val LV = of("lv")

        @JvmField val MI = of("mi")

        @JvmField val MS = of("ms")

        @JvmField val MT = of("mt")

        @JvmField val NL = of("nl")

        @JvmField val NO = of("no")

        @JvmField val OC = of("oc")

        @JvmField val PI = of("pi")

        @JvmField val PL = of("pl")

        @JvmField val PT = of("pt")

        @JvmField val RO = of("ro")

        @JvmField val RS_LATIN = of("rs_latin")

        @JvmField val SK = of("sk")

        @JvmField val SL = of("sl")

        @JvmField val SQ = of("sq")

        @JvmField val SV = of("sv")

        @JvmField val SW = of("sw")

        @JvmField val TL = of("tl")

        @JvmField val TR = of("tr")

        @JvmField val UZ = of("uz")

        @JvmField val VI = of("vi")

        @JvmField val AR = of("ar")

        @JvmField val FA = of("fa")

        @JvmField val UG = of("ug")

        @JvmField val UR = of("ur")

        @JvmField val BN = of("bn")

        @JvmField val AS = of("as")

        @JvmField val MNI = of("mni")

        @JvmField val RU = of("ru")

        @JvmField val RS_CYRILLIC = of("rs_cyrillic")

        @JvmField val BE = of("be")

        @JvmField val BG = of("bg")

        @JvmField val UK = of("uk")

        @JvmField val MN = of("mn")

        @JvmField val ABQ = of("abq")

        @JvmField val ADY = of("ady")

        @JvmField val KBD = of("kbd")

        @JvmField val AVA = of("ava")

        @JvmField val DAR = of("dar")

        @JvmField val INH = of("inh")

        @JvmField val CHE = of("che")

        @JvmField val LBE = of("lbe")

        @JvmField val LEZ = of("lez")

        @JvmField val TAB = of("tab")

        @JvmField val TJK = of("tjk")

        @JvmField val HI = of("hi")

        @JvmField val MR = of("mr")

        @JvmField val NE = of("ne")

        @JvmField val BH = of("bh")

        @JvmField val MAI = of("mai")

        @JvmField val ANG = of("ang")

        @JvmField val BHO = of("bho")

        @JvmField val MAH = of("mah")

        @JvmField val SCK = of("sck")

        @JvmField val NEW = of("new")

        @JvmField val GOM = of("gom")

        @JvmField val SA = of("sa")

        @JvmField val BGC = of("bgc")

        @JvmField val TH = of("th")

        @JvmField val CH_SIM = of("ch_sim")

        @JvmField val CH_TRA = of("ch_tra")

        @JvmField val JA = of("ja")

        @JvmField val KO = of("ko")

        @JvmField val TA = of("ta")

        @JvmField val TE = of("te")

        @JvmField val KN = of("kn")

        @JvmStatic fun of(value: String) = ParsingLanguages(JsonField.of(value))
    }

    /** An enum containing [ParsingLanguages]'s known values. */
    enum class Known {
        AF,
        AZ,
        BS,
        CS,
        CY,
        DA,
        DE,
        EN,
        ES,
        ET,
        FR,
        GA,
        HR,
        HU,
        ID,
        IS,
        IT,
        KU,
        LA,
        LT,
        LV,
        MI,
        MS,
        MT,
        NL,
        NO,
        OC,
        PI,
        PL,
        PT,
        RO,
        RS_LATIN,
        SK,
        SL,
        SQ,
        SV,
        SW,
        TL,
        TR,
        UZ,
        VI,
        AR,
        FA,
        UG,
        UR,
        BN,
        AS,
        MNI,
        RU,
        RS_CYRILLIC,
        BE,
        BG,
        UK,
        MN,
        ABQ,
        ADY,
        KBD,
        AVA,
        DAR,
        INH,
        CHE,
        LBE,
        LEZ,
        TAB,
        TJK,
        HI,
        MR,
        NE,
        BH,
        MAI,
        ANG,
        BHO,
        MAH,
        SCK,
        NEW,
        GOM,
        SA,
        BGC,
        TH,
        CH_SIM,
        CH_TRA,
        JA,
        KO,
        TA,
        TE,
        KN,
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
        AF,
        AZ,
        BS,
        CS,
        CY,
        DA,
        DE,
        EN,
        ES,
        ET,
        FR,
        GA,
        HR,
        HU,
        ID,
        IS,
        IT,
        KU,
        LA,
        LT,
        LV,
        MI,
        MS,
        MT,
        NL,
        NO,
        OC,
        PI,
        PL,
        PT,
        RO,
        RS_LATIN,
        SK,
        SL,
        SQ,
        SV,
        SW,
        TL,
        TR,
        UZ,
        VI,
        AR,
        FA,
        UG,
        UR,
        BN,
        AS,
        MNI,
        RU,
        RS_CYRILLIC,
        BE,
        BG,
        UK,
        MN,
        ABQ,
        ADY,
        KBD,
        AVA,
        DAR,
        INH,
        CHE,
        LBE,
        LEZ,
        TAB,
        TJK,
        HI,
        MR,
        NE,
        BH,
        MAI,
        ANG,
        BHO,
        MAH,
        SCK,
        NEW,
        GOM,
        SA,
        BGC,
        TH,
        CH_SIM,
        CH_TRA,
        JA,
        KO,
        TA,
        TE,
        KN,
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
            AF -> Value.AF
            AZ -> Value.AZ
            BS -> Value.BS
            CS -> Value.CS
            CY -> Value.CY
            DA -> Value.DA
            DE -> Value.DE
            EN -> Value.EN
            ES -> Value.ES
            ET -> Value.ET
            FR -> Value.FR
            GA -> Value.GA
            HR -> Value.HR
            HU -> Value.HU
            ID -> Value.ID
            IS -> Value.IS
            IT -> Value.IT
            KU -> Value.KU
            LA -> Value.LA
            LT -> Value.LT
            LV -> Value.LV
            MI -> Value.MI
            MS -> Value.MS
            MT -> Value.MT
            NL -> Value.NL
            NO -> Value.NO
            OC -> Value.OC
            PI -> Value.PI
            PL -> Value.PL
            PT -> Value.PT
            RO -> Value.RO
            RS_LATIN -> Value.RS_LATIN
            SK -> Value.SK
            SL -> Value.SL
            SQ -> Value.SQ
            SV -> Value.SV
            SW -> Value.SW
            TL -> Value.TL
            TR -> Value.TR
            UZ -> Value.UZ
            VI -> Value.VI
            AR -> Value.AR
            FA -> Value.FA
            UG -> Value.UG
            UR -> Value.UR
            BN -> Value.BN
            AS -> Value.AS
            MNI -> Value.MNI
            RU -> Value.RU
            RS_CYRILLIC -> Value.RS_CYRILLIC
            BE -> Value.BE
            BG -> Value.BG
            UK -> Value.UK
            MN -> Value.MN
            ABQ -> Value.ABQ
            ADY -> Value.ADY
            KBD -> Value.KBD
            AVA -> Value.AVA
            DAR -> Value.DAR
            INH -> Value.INH
            CHE -> Value.CHE
            LBE -> Value.LBE
            LEZ -> Value.LEZ
            TAB -> Value.TAB
            TJK -> Value.TJK
            HI -> Value.HI
            MR -> Value.MR
            NE -> Value.NE
            BH -> Value.BH
            MAI -> Value.MAI
            ANG -> Value.ANG
            BHO -> Value.BHO
            MAH -> Value.MAH
            SCK -> Value.SCK
            NEW -> Value.NEW
            GOM -> Value.GOM
            SA -> Value.SA
            BGC -> Value.BGC
            TH -> Value.TH
            CH_SIM -> Value.CH_SIM
            CH_TRA -> Value.CH_TRA
            JA -> Value.JA
            KO -> Value.KO
            TA -> Value.TA
            TE -> Value.TE
            KN -> Value.KN
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
            AF -> Known.AF
            AZ -> Known.AZ
            BS -> Known.BS
            CS -> Known.CS
            CY -> Known.CY
            DA -> Known.DA
            DE -> Known.DE
            EN -> Known.EN
            ES -> Known.ES
            ET -> Known.ET
            FR -> Known.FR
            GA -> Known.GA
            HR -> Known.HR
            HU -> Known.HU
            ID -> Known.ID
            IS -> Known.IS
            IT -> Known.IT
            KU -> Known.KU
            LA -> Known.LA
            LT -> Known.LT
            LV -> Known.LV
            MI -> Known.MI
            MS -> Known.MS
            MT -> Known.MT
            NL -> Known.NL
            NO -> Known.NO
            OC -> Known.OC
            PI -> Known.PI
            PL -> Known.PL
            PT -> Known.PT
            RO -> Known.RO
            RS_LATIN -> Known.RS_LATIN
            SK -> Known.SK
            SL -> Known.SL
            SQ -> Known.SQ
            SV -> Known.SV
            SW -> Known.SW
            TL -> Known.TL
            TR -> Known.TR
            UZ -> Known.UZ
            VI -> Known.VI
            AR -> Known.AR
            FA -> Known.FA
            UG -> Known.UG
            UR -> Known.UR
            BN -> Known.BN
            AS -> Known.AS
            MNI -> Known.MNI
            RU -> Known.RU
            RS_CYRILLIC -> Known.RS_CYRILLIC
            BE -> Known.BE
            BG -> Known.BG
            UK -> Known.UK
            MN -> Known.MN
            ABQ -> Known.ABQ
            ADY -> Known.ADY
            KBD -> Known.KBD
            AVA -> Known.AVA
            DAR -> Known.DAR
            INH -> Known.INH
            CHE -> Known.CHE
            LBE -> Known.LBE
            LEZ -> Known.LEZ
            TAB -> Known.TAB
            TJK -> Known.TJK
            HI -> Known.HI
            MR -> Known.MR
            NE -> Known.NE
            BH -> Known.BH
            MAI -> Known.MAI
            ANG -> Known.ANG
            BHO -> Known.BHO
            MAH -> Known.MAH
            SCK -> Known.SCK
            NEW -> Known.NEW
            GOM -> Known.GOM
            SA -> Known.SA
            BGC -> Known.BGC
            TH -> Known.TH
            CH_SIM -> Known.CH_SIM
            CH_TRA -> Known.CH_TRA
            JA -> Known.JA
            KO -> Known.KO
            TA -> Known.TA
            TE -> Known.TE
            KN -> Known.KN
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
