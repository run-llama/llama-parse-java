// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.parsing

import com.fasterxml.jackson.annotation.JsonCreator
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException

/** Enum for supported file extensions. */
class LlamaParseSupportedFileExtensions
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val PDF = of(".pdf")

        @JvmField val ABW = of(".abw")

        @JvmField val AWT = of(".awt")

        @JvmField val CGM = of(".cgm")

        @JvmField val CWK = of(".cwk")

        @JvmField val DOC = of(".doc")

        @JvmField val DOCM = of(".docm")

        @JvmField val DOCX = of(".docx")

        @JvmField val DOT = of(".dot")

        @JvmField val DOTM = of(".dotm")

        @JvmField val DOTX = of(".dotx")

        @JvmField val FODG = of(".fodg")

        @JvmField val FODP = of(".fodp")

        @JvmField val FOPD = of(".fopd")

        @JvmField val FODT = of(".fodt")

        @JvmField val FB2 = of(".fb2")

        @JvmField val HWP = of(".hwp")

        @JvmField val LWP = of(".lwp")

        @JvmField val MCW = of(".mcw")

        @JvmField val MW = of(".mw")

        @JvmField val MWD = of(".mwd")

        @JvmField val ODF = of(".odf")

        @JvmField val ODT = of(".odt")

        @JvmField val OTG = of(".otg")

        @JvmField val OTT = of(".ott")

        @JvmField val PAGES = of(".pages")

        @JvmField val PBD = of(".pbd")

        @JvmField val PSW = of(".psw")

        @JvmField val RTF = of(".rtf")

        @JvmField val SDA = of(".sda")

        @JvmField val SDD = of(".sdd")

        @JvmField val SDP = of(".sdp")

        @JvmField val SDW = of(".sdw")

        @JvmField val SGL = of(".sgl")

        @JvmField val STD = of(".std")

        @JvmField val STW = of(".stw")

        @JvmField val SXD = of(".sxd")

        @JvmField val SXG = of(".sxg")

        @JvmField val SXM = of(".sxm")

        @JvmField val SXW = of(".sxw")

        @JvmField val UOF = of(".uof")

        @JvmField val UOP = of(".uop")

        @JvmField val UOT = of(".uot")

        @JvmField val VOR = of(".vor")

        @JvmField val WPD = of(".wpd")

        @JvmField val WPS = of(".wps")

        @JvmField val WPT = of(".wpt")

        @JvmField val WRI = of(".wri")

        @JvmField val WN = of(".wn")

        @JvmField val XML = of(".xml")

        @JvmField val ZABW = of(".zabw")

        @JvmField val KEY = of(".key")

        @JvmField val ODP = of(".odp")

        @JvmField val ODG = of(".odg")

        @JvmField val OTP = of(".otp")

        @JvmField val POT = of(".pot")

        @JvmField val POTM = of(".potm")

        @JvmField val POTX = of(".potx")

        @JvmField val PPT = of(".ppt")

        @JvmField val PPTM = of(".pptm")

        @JvmField val PPTX = of(".pptx")

        @JvmField val STI = of(".sti")

        @JvmField val SXI = of(".sxi")

        @JvmField val VSD = of(".vsd")

        @JvmField val VSDM = of(".vsdm")

        @JvmField val VSDX = of(".vsdx")

        @JvmField val VDX = of(".vdx")

        @JvmField val BMP = of(".bmp")

        @JvmField val GIF = of(".gif")

        @JvmField val HEIC = of(".heic")

        @JvmField val HEIF = of(".heif")

        @JvmField val JPG = of(".jpg")

        @JvmField val JPEG = of(".jpeg")

        @JvmField val PNG = of(".png")

        @JvmField val SVG = of(".svg")

        @JvmField val TIF = of(".tif")

        @JvmField val TIFF = of(".tiff")

        @JvmField val WEBP = of(".webp")

        @JvmField val HTM = of(".htm")

        @JvmField val HTML = of(".html")

        @JvmField val XHTM = of(".xhtm")

        @JvmField val CSV = of(".csv")

        @JvmField val DBF = of(".dbf")

        @JvmField val DIF = of(".dif")

        @JvmField val ET = of(".et")

        @JvmField val ETH = of(".eth")

        @JvmField val FODS = of(".fods")

        @JvmField val NUMBERS = of(".numbers")

        @JvmField val ODS = of(".ods")

        @JvmField val OTS = of(".ots")

        @JvmField val PRN = of(".prn")

        @JvmField val QPW = of(".qpw")

        @JvmField val SLK = of(".slk")

        @JvmField val STC = of(".stc")

        @JvmField val SXC = of(".sxc")

        @JvmField val SYLK = of(".sylk")

        @JvmField val TSV = of(".tsv")

        @JvmField val UOS1 = of(".uos1")

        @JvmField val UOS2 = of(".uos2")

        @JvmField val UOS = of(".uos")

        @JvmField val WB1 = of(".wb1")

        @JvmField val WB2 = of(".wb2")

        @JvmField val WB3 = of(".wb3")

        @JvmField val WK1 = of(".wk1")

        @JvmField val WK2 = of(".wk2")

        @JvmField val WK3 = of(".wk3")

        @JvmField val WK4 = of(".wk4")

        @JvmField val WKS = of(".wks")

        @JvmField val WQ1 = of(".wq1")

        @JvmField val WQ2 = of(".wq2")

        @JvmField val XLR = of(".xlr")

        @JvmField val XLS = of(".xls")

        @JvmField val XLSB = of(".xlsb")

        @JvmField val XLSM = of(".xlsm")

        @JvmField val XLSX = of(".xlsx")

        @JvmField val XLW = of(".xlw")

        @JvmField val AZW = of(".azw")

        @JvmField val AZW3 = of(".azw3")

        @JvmField val AZW4 = of(".azw4")

        @JvmField val CB7 = of(".cb7")

        @JvmField val CBC = of(".cbc")

        @JvmField val CBR = of(".cbr")

        @JvmField val CBZ = of(".cbz")

        @JvmField val CHM = of(".chm")

        @JvmField val DJVU = of(".djvu")

        @JvmField val EPUB = of(".epub")

        @JvmField val FBZ = of(".fbz")

        @JvmField val HTMLZ = of(".htmlz")

        @JvmField val LIT = of(".lit")

        @JvmField val LRF = of(".lrf")

        @JvmField val MD = of(".md")

        @JvmField val MOBI = of(".mobi")

        @JvmField val PDB = of(".pdb")

        @JvmField val PML = of(".pml")

        @JvmField val PRC = of(".prc")

        @JvmField val RB = of(".rb")

        @JvmField val SNB = of(".snb")

        @JvmField val TCR = of(".tcr")

        @JvmField val TXTZ = of(".txtz")

        @JvmField val M4A = of(".m4a")

        @JvmField val MP3 = of(".mp3")

        @JvmField val MP4 = of(".mp4")

        @JvmField val MPEG = of(".mpeg")

        @JvmField val MPGA = of(".mpga")

        @JvmField val WAV = of(".wav")

        @JvmField val WEBM = of(".webm")

        @JvmField val YXMD = of(".yxmd")

        @JvmStatic fun of(value: String) = LlamaParseSupportedFileExtensions(JsonField.of(value))
    }

    /** An enum containing [LlamaParseSupportedFileExtensions]'s known values. */
    enum class Known {
        PDF,
        ABW,
        AWT,
        CGM,
        CWK,
        DOC,
        DOCM,
        DOCX,
        DOT,
        DOTM,
        DOTX,
        FODG,
        FODP,
        FOPD,
        FODT,
        FB2,
        HWP,
        LWP,
        MCW,
        MW,
        MWD,
        ODF,
        ODT,
        OTG,
        OTT,
        PAGES,
        PBD,
        PSW,
        RTF,
        SDA,
        SDD,
        SDP,
        SDW,
        SGL,
        STD,
        STW,
        SXD,
        SXG,
        SXM,
        SXW,
        UOF,
        UOP,
        UOT,
        VOR,
        WPD,
        WPS,
        WPT,
        WRI,
        WN,
        XML,
        ZABW,
        KEY,
        ODP,
        ODG,
        OTP,
        POT,
        POTM,
        POTX,
        PPT,
        PPTM,
        PPTX,
        STI,
        SXI,
        VSD,
        VSDM,
        VSDX,
        VDX,
        BMP,
        GIF,
        HEIC,
        HEIF,
        JPG,
        JPEG,
        PNG,
        SVG,
        TIF,
        TIFF,
        WEBP,
        HTM,
        HTML,
        XHTM,
        CSV,
        DBF,
        DIF,
        ET,
        ETH,
        FODS,
        NUMBERS,
        ODS,
        OTS,
        PRN,
        QPW,
        SLK,
        STC,
        SXC,
        SYLK,
        TSV,
        UOS1,
        UOS2,
        UOS,
        WB1,
        WB2,
        WB3,
        WK1,
        WK2,
        WK3,
        WK4,
        WKS,
        WQ1,
        WQ2,
        XLR,
        XLS,
        XLSB,
        XLSM,
        XLSX,
        XLW,
        AZW,
        AZW3,
        AZW4,
        CB7,
        CBC,
        CBR,
        CBZ,
        CHM,
        DJVU,
        EPUB,
        FBZ,
        HTMLZ,
        LIT,
        LRF,
        MD,
        MOBI,
        PDB,
        PML,
        PRC,
        RB,
        SNB,
        TCR,
        TXTZ,
        M4A,
        MP3,
        MP4,
        MPEG,
        MPGA,
        WAV,
        WEBM,
        YXMD,
    }

    /**
     * An enum containing [LlamaParseSupportedFileExtensions]'s known values, as well as an
     * [_UNKNOWN] member.
     *
     * An instance of [LlamaParseSupportedFileExtensions] can contain an unknown value in a couple
     * of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PDF,
        ABW,
        AWT,
        CGM,
        CWK,
        DOC,
        DOCM,
        DOCX,
        DOT,
        DOTM,
        DOTX,
        FODG,
        FODP,
        FOPD,
        FODT,
        FB2,
        HWP,
        LWP,
        MCW,
        MW,
        MWD,
        ODF,
        ODT,
        OTG,
        OTT,
        PAGES,
        PBD,
        PSW,
        RTF,
        SDA,
        SDD,
        SDP,
        SDW,
        SGL,
        STD,
        STW,
        SXD,
        SXG,
        SXM,
        SXW,
        UOF,
        UOP,
        UOT,
        VOR,
        WPD,
        WPS,
        WPT,
        WRI,
        WN,
        XML,
        ZABW,
        KEY,
        ODP,
        ODG,
        OTP,
        POT,
        POTM,
        POTX,
        PPT,
        PPTM,
        PPTX,
        STI,
        SXI,
        VSD,
        VSDM,
        VSDX,
        VDX,
        BMP,
        GIF,
        HEIC,
        HEIF,
        JPG,
        JPEG,
        PNG,
        SVG,
        TIF,
        TIFF,
        WEBP,
        HTM,
        HTML,
        XHTM,
        CSV,
        DBF,
        DIF,
        ET,
        ETH,
        FODS,
        NUMBERS,
        ODS,
        OTS,
        PRN,
        QPW,
        SLK,
        STC,
        SXC,
        SYLK,
        TSV,
        UOS1,
        UOS2,
        UOS,
        WB1,
        WB2,
        WB3,
        WK1,
        WK2,
        WK3,
        WK4,
        WKS,
        WQ1,
        WQ2,
        XLR,
        XLS,
        XLSB,
        XLSM,
        XLSX,
        XLW,
        AZW,
        AZW3,
        AZW4,
        CB7,
        CBC,
        CBR,
        CBZ,
        CHM,
        DJVU,
        EPUB,
        FBZ,
        HTMLZ,
        LIT,
        LRF,
        MD,
        MOBI,
        PDB,
        PML,
        PRC,
        RB,
        SNB,
        TCR,
        TXTZ,
        M4A,
        MP3,
        MP4,
        MPEG,
        MPGA,
        WAV,
        WEBM,
        YXMD,
        /**
         * An enum member indicating that [LlamaParseSupportedFileExtensions] was instantiated with
         * an unknown value.
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
            PDF -> Value.PDF
            ABW -> Value.ABW
            AWT -> Value.AWT
            CGM -> Value.CGM
            CWK -> Value.CWK
            DOC -> Value.DOC
            DOCM -> Value.DOCM
            DOCX -> Value.DOCX
            DOT -> Value.DOT
            DOTM -> Value.DOTM
            DOTX -> Value.DOTX
            FODG -> Value.FODG
            FODP -> Value.FODP
            FOPD -> Value.FOPD
            FODT -> Value.FODT
            FB2 -> Value.FB2
            HWP -> Value.HWP
            LWP -> Value.LWP
            MCW -> Value.MCW
            MW -> Value.MW
            MWD -> Value.MWD
            ODF -> Value.ODF
            ODT -> Value.ODT
            OTG -> Value.OTG
            OTT -> Value.OTT
            PAGES -> Value.PAGES
            PBD -> Value.PBD
            PSW -> Value.PSW
            RTF -> Value.RTF
            SDA -> Value.SDA
            SDD -> Value.SDD
            SDP -> Value.SDP
            SDW -> Value.SDW
            SGL -> Value.SGL
            STD -> Value.STD
            STW -> Value.STW
            SXD -> Value.SXD
            SXG -> Value.SXG
            SXM -> Value.SXM
            SXW -> Value.SXW
            UOF -> Value.UOF
            UOP -> Value.UOP
            UOT -> Value.UOT
            VOR -> Value.VOR
            WPD -> Value.WPD
            WPS -> Value.WPS
            WPT -> Value.WPT
            WRI -> Value.WRI
            WN -> Value.WN
            XML -> Value.XML
            ZABW -> Value.ZABW
            KEY -> Value.KEY
            ODP -> Value.ODP
            ODG -> Value.ODG
            OTP -> Value.OTP
            POT -> Value.POT
            POTM -> Value.POTM
            POTX -> Value.POTX
            PPT -> Value.PPT
            PPTM -> Value.PPTM
            PPTX -> Value.PPTX
            STI -> Value.STI
            SXI -> Value.SXI
            VSD -> Value.VSD
            VSDM -> Value.VSDM
            VSDX -> Value.VSDX
            VDX -> Value.VDX
            BMP -> Value.BMP
            GIF -> Value.GIF
            HEIC -> Value.HEIC
            HEIF -> Value.HEIF
            JPG -> Value.JPG
            JPEG -> Value.JPEG
            PNG -> Value.PNG
            SVG -> Value.SVG
            TIF -> Value.TIF
            TIFF -> Value.TIFF
            WEBP -> Value.WEBP
            HTM -> Value.HTM
            HTML -> Value.HTML
            XHTM -> Value.XHTM
            CSV -> Value.CSV
            DBF -> Value.DBF
            DIF -> Value.DIF
            ET -> Value.ET
            ETH -> Value.ETH
            FODS -> Value.FODS
            NUMBERS -> Value.NUMBERS
            ODS -> Value.ODS
            OTS -> Value.OTS
            PRN -> Value.PRN
            QPW -> Value.QPW
            SLK -> Value.SLK
            STC -> Value.STC
            SXC -> Value.SXC
            SYLK -> Value.SYLK
            TSV -> Value.TSV
            UOS1 -> Value.UOS1
            UOS2 -> Value.UOS2
            UOS -> Value.UOS
            WB1 -> Value.WB1
            WB2 -> Value.WB2
            WB3 -> Value.WB3
            WK1 -> Value.WK1
            WK2 -> Value.WK2
            WK3 -> Value.WK3
            WK4 -> Value.WK4
            WKS -> Value.WKS
            WQ1 -> Value.WQ1
            WQ2 -> Value.WQ2
            XLR -> Value.XLR
            XLS -> Value.XLS
            XLSB -> Value.XLSB
            XLSM -> Value.XLSM
            XLSX -> Value.XLSX
            XLW -> Value.XLW
            AZW -> Value.AZW
            AZW3 -> Value.AZW3
            AZW4 -> Value.AZW4
            CB7 -> Value.CB7
            CBC -> Value.CBC
            CBR -> Value.CBR
            CBZ -> Value.CBZ
            CHM -> Value.CHM
            DJVU -> Value.DJVU
            EPUB -> Value.EPUB
            FBZ -> Value.FBZ
            HTMLZ -> Value.HTMLZ
            LIT -> Value.LIT
            LRF -> Value.LRF
            MD -> Value.MD
            MOBI -> Value.MOBI
            PDB -> Value.PDB
            PML -> Value.PML
            PRC -> Value.PRC
            RB -> Value.RB
            SNB -> Value.SNB
            TCR -> Value.TCR
            TXTZ -> Value.TXTZ
            M4A -> Value.M4A
            MP3 -> Value.MP3
            MP4 -> Value.MP4
            MPEG -> Value.MPEG
            MPGA -> Value.MPGA
            WAV -> Value.WAV
            WEBM -> Value.WEBM
            YXMD -> Value.YXMD
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
            PDF -> Known.PDF
            ABW -> Known.ABW
            AWT -> Known.AWT
            CGM -> Known.CGM
            CWK -> Known.CWK
            DOC -> Known.DOC
            DOCM -> Known.DOCM
            DOCX -> Known.DOCX
            DOT -> Known.DOT
            DOTM -> Known.DOTM
            DOTX -> Known.DOTX
            FODG -> Known.FODG
            FODP -> Known.FODP
            FOPD -> Known.FOPD
            FODT -> Known.FODT
            FB2 -> Known.FB2
            HWP -> Known.HWP
            LWP -> Known.LWP
            MCW -> Known.MCW
            MW -> Known.MW
            MWD -> Known.MWD
            ODF -> Known.ODF
            ODT -> Known.ODT
            OTG -> Known.OTG
            OTT -> Known.OTT
            PAGES -> Known.PAGES
            PBD -> Known.PBD
            PSW -> Known.PSW
            RTF -> Known.RTF
            SDA -> Known.SDA
            SDD -> Known.SDD
            SDP -> Known.SDP
            SDW -> Known.SDW
            SGL -> Known.SGL
            STD -> Known.STD
            STW -> Known.STW
            SXD -> Known.SXD
            SXG -> Known.SXG
            SXM -> Known.SXM
            SXW -> Known.SXW
            UOF -> Known.UOF
            UOP -> Known.UOP
            UOT -> Known.UOT
            VOR -> Known.VOR
            WPD -> Known.WPD
            WPS -> Known.WPS
            WPT -> Known.WPT
            WRI -> Known.WRI
            WN -> Known.WN
            XML -> Known.XML
            ZABW -> Known.ZABW
            KEY -> Known.KEY
            ODP -> Known.ODP
            ODG -> Known.ODG
            OTP -> Known.OTP
            POT -> Known.POT
            POTM -> Known.POTM
            POTX -> Known.POTX
            PPT -> Known.PPT
            PPTM -> Known.PPTM
            PPTX -> Known.PPTX
            STI -> Known.STI
            SXI -> Known.SXI
            VSD -> Known.VSD
            VSDM -> Known.VSDM
            VSDX -> Known.VSDX
            VDX -> Known.VDX
            BMP -> Known.BMP
            GIF -> Known.GIF
            HEIC -> Known.HEIC
            HEIF -> Known.HEIF
            JPG -> Known.JPG
            JPEG -> Known.JPEG
            PNG -> Known.PNG
            SVG -> Known.SVG
            TIF -> Known.TIF
            TIFF -> Known.TIFF
            WEBP -> Known.WEBP
            HTM -> Known.HTM
            HTML -> Known.HTML
            XHTM -> Known.XHTM
            CSV -> Known.CSV
            DBF -> Known.DBF
            DIF -> Known.DIF
            ET -> Known.ET
            ETH -> Known.ETH
            FODS -> Known.FODS
            NUMBERS -> Known.NUMBERS
            ODS -> Known.ODS
            OTS -> Known.OTS
            PRN -> Known.PRN
            QPW -> Known.QPW
            SLK -> Known.SLK
            STC -> Known.STC
            SXC -> Known.SXC
            SYLK -> Known.SYLK
            TSV -> Known.TSV
            UOS1 -> Known.UOS1
            UOS2 -> Known.UOS2
            UOS -> Known.UOS
            WB1 -> Known.WB1
            WB2 -> Known.WB2
            WB3 -> Known.WB3
            WK1 -> Known.WK1
            WK2 -> Known.WK2
            WK3 -> Known.WK3
            WK4 -> Known.WK4
            WKS -> Known.WKS
            WQ1 -> Known.WQ1
            WQ2 -> Known.WQ2
            XLR -> Known.XLR
            XLS -> Known.XLS
            XLSB -> Known.XLSB
            XLSM -> Known.XLSM
            XLSX -> Known.XLSX
            XLW -> Known.XLW
            AZW -> Known.AZW
            AZW3 -> Known.AZW3
            AZW4 -> Known.AZW4
            CB7 -> Known.CB7
            CBC -> Known.CBC
            CBR -> Known.CBR
            CBZ -> Known.CBZ
            CHM -> Known.CHM
            DJVU -> Known.DJVU
            EPUB -> Known.EPUB
            FBZ -> Known.FBZ
            HTMLZ -> Known.HTMLZ
            LIT -> Known.LIT
            LRF -> Known.LRF
            MD -> Known.MD
            MOBI -> Known.MOBI
            PDB -> Known.PDB
            PML -> Known.PML
            PRC -> Known.PRC
            RB -> Known.RB
            SNB -> Known.SNB
            TCR -> Known.TCR
            TXTZ -> Known.TXTZ
            M4A -> Known.M4A
            MP3 -> Known.MP3
            MP4 -> Known.MP4
            MPEG -> Known.MPEG
            MPGA -> Known.MPGA
            WAV -> Known.WAV
            WEBM -> Known.WEBM
            YXMD -> Known.YXMD
            else ->
                throw LlamaCloudInvalidDataException(
                    "Unknown LlamaParseSupportedFileExtensions: $value"
                )
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
    fun validate(): LlamaParseSupportedFileExtensions = apply {
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

        return other is LlamaParseSupportedFileExtensions && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
