// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.parsing

import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

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

        @JvmField val ABW = of(".abw")

        @JvmField val AWT = of(".awt")

        @JvmField val AZW = of(".azw")

        @JvmField val AZW3 = of(".azw3")

        @JvmField val AZW4 = of(".azw4")

        @JvmField val BMP = of(".bmp")

        @JvmField val CB7 = of(".cb7")

        @JvmField val CBC = of(".cbc")

        @JvmField val CBR = of(".cbr")

        @JvmField val CBZ = of(".cbz")

        @JvmField val CGM = of(".cgm")

        @JvmField val CHM = of(".chm")

        @JvmField val CSV = of(".csv")

        @JvmField val CWK = of(".cwk")

        @JvmField val DBF = of(".dbf")

        @JvmField val DIF = of(".dif")

        @JvmField val DJVU = of(".djvu")

        @JvmField val DOC = of(".doc")

        @JvmField val DOCM = of(".docm")

        @JvmField val DOCX = of(".docx")

        @JvmField val DOT = of(".dot")

        @JvmField val DOTM = of(".dotm")

        @JvmField val DOTX = of(".dotx")

        @JvmField val EPUB = of(".epub")

        @JvmField val ET = of(".et")

        @JvmField val ETH = of(".eth")

        @JvmField val FB2 = of(".fb2")

        @JvmField val FBZ = of(".fbz")

        @JvmField val FODG = of(".fodg")

        @JvmField val FODP = of(".fodp")

        @JvmField val FODS = of(".fods")

        @JvmField val FODT = of(".fodt")

        @JvmField val FOPD = of(".fopd")

        @JvmField val GIF = of(".gif")

        @JvmField val HEIC = of(".heic")

        @JvmField val HEIF = of(".heif")

        @JvmField val HTM = of(".htm")

        @JvmField val HTML = of(".html")

        @JvmField val HTMLZ = of(".htmlz")

        @JvmField val HWP = of(".hwp")

        @JvmField val JPEG = of(".jpeg")

        @JvmField val JPG = of(".jpg")

        @JvmField val KEY = of(".key")

        @JvmField val LIT = of(".lit")

        @JvmField val LRF = of(".lrf")

        @JvmField val LWP = of(".lwp")

        @JvmField val M4A = of(".m4a")

        @JvmField val MCW = of(".mcw")

        @JvmField val MD = of(".md")

        @JvmField val MOBI = of(".mobi")

        @JvmField val MP3 = of(".mp3")

        @JvmField val MP4 = of(".mp4")

        @JvmField val MPEG = of(".mpeg")

        @JvmField val MPGA = of(".mpga")

        @JvmField val MW = of(".mw")

        @JvmField val MWD = of(".mwd")

        @JvmField val NUMBERS = of(".numbers")

        @JvmField val ODF = of(".odf")

        @JvmField val ODG = of(".odg")

        @JvmField val ODP = of(".odp")

        @JvmField val ODS = of(".ods")

        @JvmField val ODT = of(".odt")

        @JvmField val OTG = of(".otg")

        @JvmField val OTP = of(".otp")

        @JvmField val OTS = of(".ots")

        @JvmField val OTT = of(".ott")

        @JvmField val PAGES = of(".pages")

        @JvmField val PBD = of(".pbd")

        @JvmField val PDB = of(".pdb")

        @JvmField val PDF = of(".pdf")

        @JvmField val PML = of(".pml")

        @JvmField val PNG = of(".png")

        @JvmField val POT = of(".pot")

        @JvmField val POTM = of(".potm")

        @JvmField val POTX = of(".potx")

        @JvmField val PPT = of(".ppt")

        @JvmField val PPTM = of(".pptm")

        @JvmField val PPTX = of(".pptx")

        @JvmField val PRC = of(".prc")

        @JvmField val PRN = of(".prn")

        @JvmField val PSW = of(".psw")

        @JvmField val QPW = of(".qpw")

        @JvmField val RB = of(".rb")

        @JvmField val RTF = of(".rtf")

        @JvmField val SDA = of(".sda")

        @JvmField val SDD = of(".sdd")

        @JvmField val SDP = of(".sdp")

        @JvmField val SDW = of(".sdw")

        @JvmField val SGL = of(".sgl")

        @JvmField val SLK = of(".slk")

        @JvmField val SNB = of(".snb")

        @JvmField val STC = of(".stc")

        @JvmField val STD = of(".std")

        @JvmField val STI = of(".sti")

        @JvmField val STW = of(".stw")

        @JvmField val SVG = of(".svg")

        @JvmField val SXC = of(".sxc")

        @JvmField val SXD = of(".sxd")

        @JvmField val SXG = of(".sxg")

        @JvmField val SXI = of(".sxi")

        @JvmField val SXM = of(".sxm")

        @JvmField val SXW = of(".sxw")

        @JvmField val SYLK = of(".sylk")

        @JvmField val TCR = of(".tcr")

        @JvmField val TIF = of(".tif")

        @JvmField val TIFF = of(".tiff")

        @JvmField val TSV = of(".tsv")

        @JvmField val TXTZ = of(".txtz")

        @JvmField val UOF = of(".uof")

        @JvmField val UOP = of(".uop")

        @JvmField val UOS = of(".uos")

        @JvmField val UOS1 = of(".uos1")

        @JvmField val UOS2 = of(".uos2")

        @JvmField val UOT = of(".uot")

        @JvmField val VDX = of(".vdx")

        @JvmField val VOR = of(".vor")

        @JvmField val VSD = of(".vsd")

        @JvmField val VSDM = of(".vsdm")

        @JvmField val VSDX = of(".vsdx")

        @JvmField val WAV = of(".wav")

        @JvmField val WB1 = of(".wb1")

        @JvmField val WB2 = of(".wb2")

        @JvmField val WB3 = of(".wb3")

        @JvmField val WEBM = of(".webm")

        @JvmField val WEBP = of(".webp")

        @JvmField val WK1 = of(".wk1")

        @JvmField val WK2 = of(".wk2")

        @JvmField val WK3 = of(".wk3")

        @JvmField val WK4 = of(".wk4")

        @JvmField val WKS = of(".wks")

        @JvmField val WN = of(".wn")

        @JvmField val WPD = of(".wpd")

        @JvmField val WPS = of(".wps")

        @JvmField val WPT = of(".wpt")

        @JvmField val WQ1 = of(".wq1")

        @JvmField val WQ2 = of(".wq2")

        @JvmField val WRI = of(".wri")

        @JvmField val XHTM = of(".xhtm")

        @JvmField val XLR = of(".xlr")

        @JvmField val XLS = of(".xls")

        @JvmField val XLSB = of(".xlsb")

        @JvmField val XLSM = of(".xlsm")

        @JvmField val XLSX = of(".xlsx")

        @JvmField val XLW = of(".xlw")

        @JvmField val XML = of(".xml")

        @JvmField val YXMD = of(".yxmd")

        @JvmField val ZABW = of(".zabw")

        @JvmStatic fun of(value: String) = LlamaParseSupportedFileExtensions(JsonField.of(value))
    }

    /** An enum containing [LlamaParseSupportedFileExtensions]'s known values. */
    enum class Known {
        ABW,
        AWT,
        AZW,
        AZW3,
        AZW4,
        BMP,
        CB7,
        CBC,
        CBR,
        CBZ,
        CGM,
        CHM,
        CSV,
        CWK,
        DBF,
        DIF,
        DJVU,
        DOC,
        DOCM,
        DOCX,
        DOT,
        DOTM,
        DOTX,
        EPUB,
        ET,
        ETH,
        FB2,
        FBZ,
        FODG,
        FODP,
        FODS,
        FODT,
        FOPD,
        GIF,
        HEIC,
        HEIF,
        HTM,
        HTML,
        HTMLZ,
        HWP,
        JPEG,
        JPG,
        KEY,
        LIT,
        LRF,
        LWP,
        M4A,
        MCW,
        MD,
        MOBI,
        MP3,
        MP4,
        MPEG,
        MPGA,
        MW,
        MWD,
        NUMBERS,
        ODF,
        ODG,
        ODP,
        ODS,
        ODT,
        OTG,
        OTP,
        OTS,
        OTT,
        PAGES,
        PBD,
        PDB,
        PDF,
        PML,
        PNG,
        POT,
        POTM,
        POTX,
        PPT,
        PPTM,
        PPTX,
        PRC,
        PRN,
        PSW,
        QPW,
        RB,
        RTF,
        SDA,
        SDD,
        SDP,
        SDW,
        SGL,
        SLK,
        SNB,
        STC,
        STD,
        STI,
        STW,
        SVG,
        SXC,
        SXD,
        SXG,
        SXI,
        SXM,
        SXW,
        SYLK,
        TCR,
        TIF,
        TIFF,
        TSV,
        TXTZ,
        UOF,
        UOP,
        UOS,
        UOS1,
        UOS2,
        UOT,
        VDX,
        VOR,
        VSD,
        VSDM,
        VSDX,
        WAV,
        WB1,
        WB2,
        WB3,
        WEBM,
        WEBP,
        WK1,
        WK2,
        WK3,
        WK4,
        WKS,
        WN,
        WPD,
        WPS,
        WPT,
        WQ1,
        WQ2,
        WRI,
        XHTM,
        XLR,
        XLS,
        XLSB,
        XLSM,
        XLSX,
        XLW,
        XML,
        YXMD,
        ZABW,
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
        ABW,
        AWT,
        AZW,
        AZW3,
        AZW4,
        BMP,
        CB7,
        CBC,
        CBR,
        CBZ,
        CGM,
        CHM,
        CSV,
        CWK,
        DBF,
        DIF,
        DJVU,
        DOC,
        DOCM,
        DOCX,
        DOT,
        DOTM,
        DOTX,
        EPUB,
        ET,
        ETH,
        FB2,
        FBZ,
        FODG,
        FODP,
        FODS,
        FODT,
        FOPD,
        GIF,
        HEIC,
        HEIF,
        HTM,
        HTML,
        HTMLZ,
        HWP,
        JPEG,
        JPG,
        KEY,
        LIT,
        LRF,
        LWP,
        M4A,
        MCW,
        MD,
        MOBI,
        MP3,
        MP4,
        MPEG,
        MPGA,
        MW,
        MWD,
        NUMBERS,
        ODF,
        ODG,
        ODP,
        ODS,
        ODT,
        OTG,
        OTP,
        OTS,
        OTT,
        PAGES,
        PBD,
        PDB,
        PDF,
        PML,
        PNG,
        POT,
        POTM,
        POTX,
        PPT,
        PPTM,
        PPTX,
        PRC,
        PRN,
        PSW,
        QPW,
        RB,
        RTF,
        SDA,
        SDD,
        SDP,
        SDW,
        SGL,
        SLK,
        SNB,
        STC,
        STD,
        STI,
        STW,
        SVG,
        SXC,
        SXD,
        SXG,
        SXI,
        SXM,
        SXW,
        SYLK,
        TCR,
        TIF,
        TIFF,
        TSV,
        TXTZ,
        UOF,
        UOP,
        UOS,
        UOS1,
        UOS2,
        UOT,
        VDX,
        VOR,
        VSD,
        VSDM,
        VSDX,
        WAV,
        WB1,
        WB2,
        WB3,
        WEBM,
        WEBP,
        WK1,
        WK2,
        WK3,
        WK4,
        WKS,
        WN,
        WPD,
        WPS,
        WPT,
        WQ1,
        WQ2,
        WRI,
        XHTM,
        XLR,
        XLS,
        XLSB,
        XLSM,
        XLSX,
        XLW,
        XML,
        YXMD,
        ZABW,
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
            ABW -> Value.ABW
            AWT -> Value.AWT
            AZW -> Value.AZW
            AZW3 -> Value.AZW3
            AZW4 -> Value.AZW4
            BMP -> Value.BMP
            CB7 -> Value.CB7
            CBC -> Value.CBC
            CBR -> Value.CBR
            CBZ -> Value.CBZ
            CGM -> Value.CGM
            CHM -> Value.CHM
            CSV -> Value.CSV
            CWK -> Value.CWK
            DBF -> Value.DBF
            DIF -> Value.DIF
            DJVU -> Value.DJVU
            DOC -> Value.DOC
            DOCM -> Value.DOCM
            DOCX -> Value.DOCX
            DOT -> Value.DOT
            DOTM -> Value.DOTM
            DOTX -> Value.DOTX
            EPUB -> Value.EPUB
            ET -> Value.ET
            ETH -> Value.ETH
            FB2 -> Value.FB2
            FBZ -> Value.FBZ
            FODG -> Value.FODG
            FODP -> Value.FODP
            FODS -> Value.FODS
            FODT -> Value.FODT
            FOPD -> Value.FOPD
            GIF -> Value.GIF
            HEIC -> Value.HEIC
            HEIF -> Value.HEIF
            HTM -> Value.HTM
            HTML -> Value.HTML
            HTMLZ -> Value.HTMLZ
            HWP -> Value.HWP
            JPEG -> Value.JPEG
            JPG -> Value.JPG
            KEY -> Value.KEY
            LIT -> Value.LIT
            LRF -> Value.LRF
            LWP -> Value.LWP
            M4A -> Value.M4A
            MCW -> Value.MCW
            MD -> Value.MD
            MOBI -> Value.MOBI
            MP3 -> Value.MP3
            MP4 -> Value.MP4
            MPEG -> Value.MPEG
            MPGA -> Value.MPGA
            MW -> Value.MW
            MWD -> Value.MWD
            NUMBERS -> Value.NUMBERS
            ODF -> Value.ODF
            ODG -> Value.ODG
            ODP -> Value.ODP
            ODS -> Value.ODS
            ODT -> Value.ODT
            OTG -> Value.OTG
            OTP -> Value.OTP
            OTS -> Value.OTS
            OTT -> Value.OTT
            PAGES -> Value.PAGES
            PBD -> Value.PBD
            PDB -> Value.PDB
            PDF -> Value.PDF
            PML -> Value.PML
            PNG -> Value.PNG
            POT -> Value.POT
            POTM -> Value.POTM
            POTX -> Value.POTX
            PPT -> Value.PPT
            PPTM -> Value.PPTM
            PPTX -> Value.PPTX
            PRC -> Value.PRC
            PRN -> Value.PRN
            PSW -> Value.PSW
            QPW -> Value.QPW
            RB -> Value.RB
            RTF -> Value.RTF
            SDA -> Value.SDA
            SDD -> Value.SDD
            SDP -> Value.SDP
            SDW -> Value.SDW
            SGL -> Value.SGL
            SLK -> Value.SLK
            SNB -> Value.SNB
            STC -> Value.STC
            STD -> Value.STD
            STI -> Value.STI
            STW -> Value.STW
            SVG -> Value.SVG
            SXC -> Value.SXC
            SXD -> Value.SXD
            SXG -> Value.SXG
            SXI -> Value.SXI
            SXM -> Value.SXM
            SXW -> Value.SXW
            SYLK -> Value.SYLK
            TCR -> Value.TCR
            TIF -> Value.TIF
            TIFF -> Value.TIFF
            TSV -> Value.TSV
            TXTZ -> Value.TXTZ
            UOF -> Value.UOF
            UOP -> Value.UOP
            UOS -> Value.UOS
            UOS1 -> Value.UOS1
            UOS2 -> Value.UOS2
            UOT -> Value.UOT
            VDX -> Value.VDX
            VOR -> Value.VOR
            VSD -> Value.VSD
            VSDM -> Value.VSDM
            VSDX -> Value.VSDX
            WAV -> Value.WAV
            WB1 -> Value.WB1
            WB2 -> Value.WB2
            WB3 -> Value.WB3
            WEBM -> Value.WEBM
            WEBP -> Value.WEBP
            WK1 -> Value.WK1
            WK2 -> Value.WK2
            WK3 -> Value.WK3
            WK4 -> Value.WK4
            WKS -> Value.WKS
            WN -> Value.WN
            WPD -> Value.WPD
            WPS -> Value.WPS
            WPT -> Value.WPT
            WQ1 -> Value.WQ1
            WQ2 -> Value.WQ2
            WRI -> Value.WRI
            XHTM -> Value.XHTM
            XLR -> Value.XLR
            XLS -> Value.XLS
            XLSB -> Value.XLSB
            XLSM -> Value.XLSM
            XLSX -> Value.XLSX
            XLW -> Value.XLW
            XML -> Value.XML
            YXMD -> Value.YXMD
            ZABW -> Value.ZABW
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
            ABW -> Known.ABW
            AWT -> Known.AWT
            AZW -> Known.AZW
            AZW3 -> Known.AZW3
            AZW4 -> Known.AZW4
            BMP -> Known.BMP
            CB7 -> Known.CB7
            CBC -> Known.CBC
            CBR -> Known.CBR
            CBZ -> Known.CBZ
            CGM -> Known.CGM
            CHM -> Known.CHM
            CSV -> Known.CSV
            CWK -> Known.CWK
            DBF -> Known.DBF
            DIF -> Known.DIF
            DJVU -> Known.DJVU
            DOC -> Known.DOC
            DOCM -> Known.DOCM
            DOCX -> Known.DOCX
            DOT -> Known.DOT
            DOTM -> Known.DOTM
            DOTX -> Known.DOTX
            EPUB -> Known.EPUB
            ET -> Known.ET
            ETH -> Known.ETH
            FB2 -> Known.FB2
            FBZ -> Known.FBZ
            FODG -> Known.FODG
            FODP -> Known.FODP
            FODS -> Known.FODS
            FODT -> Known.FODT
            FOPD -> Known.FOPD
            GIF -> Known.GIF
            HEIC -> Known.HEIC
            HEIF -> Known.HEIF
            HTM -> Known.HTM
            HTML -> Known.HTML
            HTMLZ -> Known.HTMLZ
            HWP -> Known.HWP
            JPEG -> Known.JPEG
            JPG -> Known.JPG
            KEY -> Known.KEY
            LIT -> Known.LIT
            LRF -> Known.LRF
            LWP -> Known.LWP
            M4A -> Known.M4A
            MCW -> Known.MCW
            MD -> Known.MD
            MOBI -> Known.MOBI
            MP3 -> Known.MP3
            MP4 -> Known.MP4
            MPEG -> Known.MPEG
            MPGA -> Known.MPGA
            MW -> Known.MW
            MWD -> Known.MWD
            NUMBERS -> Known.NUMBERS
            ODF -> Known.ODF
            ODG -> Known.ODG
            ODP -> Known.ODP
            ODS -> Known.ODS
            ODT -> Known.ODT
            OTG -> Known.OTG
            OTP -> Known.OTP
            OTS -> Known.OTS
            OTT -> Known.OTT
            PAGES -> Known.PAGES
            PBD -> Known.PBD
            PDB -> Known.PDB
            PDF -> Known.PDF
            PML -> Known.PML
            PNG -> Known.PNG
            POT -> Known.POT
            POTM -> Known.POTM
            POTX -> Known.POTX
            PPT -> Known.PPT
            PPTM -> Known.PPTM
            PPTX -> Known.PPTX
            PRC -> Known.PRC
            PRN -> Known.PRN
            PSW -> Known.PSW
            QPW -> Known.QPW
            RB -> Known.RB
            RTF -> Known.RTF
            SDA -> Known.SDA
            SDD -> Known.SDD
            SDP -> Known.SDP
            SDW -> Known.SDW
            SGL -> Known.SGL
            SLK -> Known.SLK
            SNB -> Known.SNB
            STC -> Known.STC
            STD -> Known.STD
            STI -> Known.STI
            STW -> Known.STW
            SVG -> Known.SVG
            SXC -> Known.SXC
            SXD -> Known.SXD
            SXG -> Known.SXG
            SXI -> Known.SXI
            SXM -> Known.SXM
            SXW -> Known.SXW
            SYLK -> Known.SYLK
            TCR -> Known.TCR
            TIF -> Known.TIF
            TIFF -> Known.TIFF
            TSV -> Known.TSV
            TXTZ -> Known.TXTZ
            UOF -> Known.UOF
            UOP -> Known.UOP
            UOS -> Known.UOS
            UOS1 -> Known.UOS1
            UOS2 -> Known.UOS2
            UOT -> Known.UOT
            VDX -> Known.VDX
            VOR -> Known.VOR
            VSD -> Known.VSD
            VSDM -> Known.VSDM
            VSDX -> Known.VSDX
            WAV -> Known.WAV
            WB1 -> Known.WB1
            WB2 -> Known.WB2
            WB3 -> Known.WB3
            WEBM -> Known.WEBM
            WEBP -> Known.WEBP
            WK1 -> Known.WK1
            WK2 -> Known.WK2
            WK3 -> Known.WK3
            WK4 -> Known.WK4
            WKS -> Known.WKS
            WN -> Known.WN
            WPD -> Known.WPD
            WPS -> Known.WPS
            WPT -> Known.WPT
            WQ1 -> Known.WQ1
            WQ2 -> Known.WQ2
            WRI -> Known.WRI
            XHTM -> Known.XHTM
            XLR -> Known.XLR
            XLS -> Known.XLS
            XLSB -> Known.XLSB
            XLSM -> Known.XLSM
            XLSX -> Known.XLSX
            XLW -> Known.XLW
            XML -> Known.XML
            YXMD -> Known.YXMD
            ZABW -> Known.ZABW
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
