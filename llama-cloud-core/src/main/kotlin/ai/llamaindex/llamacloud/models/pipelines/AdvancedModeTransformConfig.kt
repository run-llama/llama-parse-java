// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloud.models.pipelines

import ai.llamaindex.llamacloud.core.BaseDeserializer
import ai.llamaindex.llamacloud.core.BaseSerializer
import ai.llamaindex.llamacloud.core.Enum
import ai.llamaindex.llamacloud.core.ExcludeMissing
import ai.llamaindex.llamacloud.core.JsonField
import ai.llamaindex.llamacloud.core.JsonMissing
import ai.llamaindex.llamacloud.core.JsonValue
import ai.llamaindex.llamacloud.core.allMaxBy
import ai.llamaindex.llamacloud.core.getOrThrow
import ai.llamaindex.llamacloud.errors.LlamaCloudInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AdvancedModeTransformConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chunkingConfig: JsonField<ChunkingConfig>,
    private val mode: JsonField<Mode>,
    private val segmentationConfig: JsonField<SegmentationConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunking_config")
        @ExcludeMissing
        chunkingConfig: JsonField<ChunkingConfig> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
        @JsonProperty("segmentation_config")
        @ExcludeMissing
        segmentationConfig: JsonField<SegmentationConfig> = JsonMissing.of(),
    ) : this(chunkingConfig, mode, segmentationConfig, mutableMapOf())

    /**
     * Configuration for the chunking.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chunkingConfig(): Optional<ChunkingConfig> = chunkingConfig.getOptional("chunking_config")

    /**
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mode(): Optional<Mode> = mode.getOptional("mode")

    /**
     * Configuration for the segmentation.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun segmentationConfig(): Optional<SegmentationConfig> =
        segmentationConfig.getOptional("segmentation_config")

    /**
     * Returns the raw JSON value of [chunkingConfig].
     *
     * Unlike [chunkingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunking_config")
    @ExcludeMissing
    fun _chunkingConfig(): JsonField<ChunkingConfig> = chunkingConfig

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

    /**
     * Returns the raw JSON value of [segmentationConfig].
     *
     * Unlike [segmentationConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("segmentation_config")
    @ExcludeMissing
    fun _segmentationConfig(): JsonField<SegmentationConfig> = segmentationConfig

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AdvancedModeTransformConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AdvancedModeTransformConfig]. */
    class Builder internal constructor() {

        private var chunkingConfig: JsonField<ChunkingConfig> = JsonMissing.of()
        private var mode: JsonField<Mode> = JsonMissing.of()
        private var segmentationConfig: JsonField<SegmentationConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(advancedModeTransformConfig: AdvancedModeTransformConfig) = apply {
            chunkingConfig = advancedModeTransformConfig.chunkingConfig
            mode = advancedModeTransformConfig.mode
            segmentationConfig = advancedModeTransformConfig.segmentationConfig
            additionalProperties = advancedModeTransformConfig.additionalProperties.toMutableMap()
        }

        /** Configuration for the chunking. */
        fun chunkingConfig(chunkingConfig: ChunkingConfig) =
            chunkingConfig(JsonField.of(chunkingConfig))

        /**
         * Sets [Builder.chunkingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkingConfig] with a well-typed [ChunkingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chunkingConfig(chunkingConfig: JsonField<ChunkingConfig>) = apply {
            this.chunkingConfig = chunkingConfig
        }

        /** Alias for calling [chunkingConfig] with `ChunkingConfig.ofNone(none)`. */
        fun chunkingConfig(none: ChunkingConfig.NoneChunkingConfig) =
            chunkingConfig(ChunkingConfig.ofNone(none))

        /** Alias for calling [chunkingConfig] with `ChunkingConfig.ofCharacter(character)`. */
        fun chunkingConfig(character: ChunkingConfig.CharacterChunkingConfig) =
            chunkingConfig(ChunkingConfig.ofCharacter(character))

        /** Alias for calling [chunkingConfig] with `ChunkingConfig.ofToken(token)`. */
        fun chunkingConfig(token: ChunkingConfig.TokenChunkingConfig) =
            chunkingConfig(ChunkingConfig.ofToken(token))

        /** Alias for calling [chunkingConfig] with `ChunkingConfig.ofSentence(sentence)`. */
        fun chunkingConfig(sentence: ChunkingConfig.SentenceChunkingConfig) =
            chunkingConfig(ChunkingConfig.ofSentence(sentence))

        /** Alias for calling [chunkingConfig] with `ChunkingConfig.ofSemantic(semantic)`. */
        fun chunkingConfig(semantic: ChunkingConfig.SemanticChunkingConfig) =
            chunkingConfig(ChunkingConfig.ofSemantic(semantic))

        fun mode(mode: Mode) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

        /** Configuration for the segmentation. */
        fun segmentationConfig(segmentationConfig: SegmentationConfig) =
            segmentationConfig(JsonField.of(segmentationConfig))

        /**
         * Sets [Builder.segmentationConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.segmentationConfig] with a well-typed
         * [SegmentationConfig] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun segmentationConfig(segmentationConfig: JsonField<SegmentationConfig>) = apply {
            this.segmentationConfig = segmentationConfig
        }

        /** Alias for calling [segmentationConfig] with `SegmentationConfig.ofNone(none)`. */
        fun segmentationConfig(none: SegmentationConfig.NoneSegmentationConfig) =
            segmentationConfig(SegmentationConfig.ofNone(none))

        /** Alias for calling [segmentationConfig] with `SegmentationConfig.ofPage(page)`. */
        fun segmentationConfig(page: SegmentationConfig.PageSegmentationConfig) =
            segmentationConfig(SegmentationConfig.ofPage(page))

        /** Alias for calling [segmentationConfig] with `SegmentationConfig.ofElement(element)`. */
        fun segmentationConfig(element: SegmentationConfig.ElementSegmentationConfig) =
            segmentationConfig(SegmentationConfig.ofElement(element))

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AdvancedModeTransformConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AdvancedModeTransformConfig =
            AdvancedModeTransformConfig(
                chunkingConfig,
                mode,
                segmentationConfig,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AdvancedModeTransformConfig = apply {
        if (validated) {
            return@apply
        }

        chunkingConfig().ifPresent { it.validate() }
        mode().ifPresent { it.validate() }
        segmentationConfig().ifPresent { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (chunkingConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
            (segmentationConfig.asKnown().getOrNull()?.validity() ?: 0)

    /** Configuration for the chunking. */
    @JsonDeserialize(using = ChunkingConfig.Deserializer::class)
    @JsonSerialize(using = ChunkingConfig.Serializer::class)
    class ChunkingConfig
    private constructor(
        private val none: NoneChunkingConfig? = null,
        private val character: CharacterChunkingConfig? = null,
        private val token: TokenChunkingConfig? = null,
        private val sentence: SentenceChunkingConfig? = null,
        private val semantic: SemanticChunkingConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun none(): Optional<NoneChunkingConfig> = Optional.ofNullable(none)

        fun character(): Optional<CharacterChunkingConfig> = Optional.ofNullable(character)

        fun token(): Optional<TokenChunkingConfig> = Optional.ofNullable(token)

        fun sentence(): Optional<SentenceChunkingConfig> = Optional.ofNullable(sentence)

        fun semantic(): Optional<SemanticChunkingConfig> = Optional.ofNullable(semantic)

        fun isNone(): Boolean = none != null

        fun isCharacter(): Boolean = character != null

        fun isToken(): Boolean = token != null

        fun isSentence(): Boolean = sentence != null

        fun isSemantic(): Boolean = semantic != null

        fun asNone(): NoneChunkingConfig = none.getOrThrow("none")

        fun asCharacter(): CharacterChunkingConfig = character.getOrThrow("character")

        fun asToken(): TokenChunkingConfig = token.getOrThrow("token")

        fun asSentence(): SentenceChunkingConfig = sentence.getOrThrow("sentence")

        fun asSemantic(): SemanticChunkingConfig = semantic.getOrThrow("semantic")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = chunkingConfig.accept(new ChunkingConfig.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNone(NoneChunkingConfig none) {
         *         return Optional.of(none.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                none != null -> visitor.visitNone(none)
                character != null -> visitor.visitCharacter(character)
                token != null -> visitor.visitToken(token)
                sentence != null -> visitor.visitSentence(sentence)
                semantic != null -> visitor.visitSemantic(semantic)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ChunkingConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNone(none: NoneChunkingConfig) {
                        none.validate()
                    }

                    override fun visitCharacter(character: CharacterChunkingConfig) {
                        character.validate()
                    }

                    override fun visitToken(token: TokenChunkingConfig) {
                        token.validate()
                    }

                    override fun visitSentence(sentence: SentenceChunkingConfig) {
                        sentence.validate()
                    }

                    override fun visitSemantic(semantic: SemanticChunkingConfig) {
                        semantic.validate()
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNone(none: NoneChunkingConfig) = none.validity()

                    override fun visitCharacter(character: CharacterChunkingConfig) =
                        character.validity()

                    override fun visitToken(token: TokenChunkingConfig) = token.validity()

                    override fun visitSentence(sentence: SentenceChunkingConfig) =
                        sentence.validity()

                    override fun visitSemantic(semantic: SemanticChunkingConfig) =
                        semantic.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChunkingConfig &&
                none == other.none &&
                character == other.character &&
                token == other.token &&
                sentence == other.sentence &&
                semantic == other.semantic
        }

        override fun hashCode(): Int = Objects.hash(none, character, token, sentence, semantic)

        override fun toString(): String =
            when {
                none != null -> "ChunkingConfig{none=$none}"
                character != null -> "ChunkingConfig{character=$character}"
                token != null -> "ChunkingConfig{token=$token}"
                sentence != null -> "ChunkingConfig{sentence=$sentence}"
                semantic != null -> "ChunkingConfig{semantic=$semantic}"
                _json != null -> "ChunkingConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ChunkingConfig")
            }

        companion object {

            @JvmStatic fun ofNone(none: NoneChunkingConfig) = ChunkingConfig(none = none)

            @JvmStatic
            fun ofCharacter(character: CharacterChunkingConfig) =
                ChunkingConfig(character = character)

            @JvmStatic fun ofToken(token: TokenChunkingConfig) = ChunkingConfig(token = token)

            @JvmStatic
            fun ofSentence(sentence: SentenceChunkingConfig) = ChunkingConfig(sentence = sentence)

            @JvmStatic
            fun ofSemantic(semantic: SemanticChunkingConfig) = ChunkingConfig(semantic = semantic)
        }

        /**
         * An interface that defines how to map each variant of [ChunkingConfig] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNone(none: NoneChunkingConfig): T

            fun visitCharacter(character: CharacterChunkingConfig): T

            fun visitToken(token: TokenChunkingConfig): T

            fun visitSentence(sentence: SentenceChunkingConfig): T

            fun visitSemantic(semantic: SemanticChunkingConfig): T

            /**
             * Maps an unknown variant of [ChunkingConfig] to a value of type [T].
             *
             * An instance of [ChunkingConfig] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown ChunkingConfig: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ChunkingConfig>(ChunkingConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ChunkingConfig {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<NoneChunkingConfig>())?.let {
                                ChunkingConfig(none = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CharacterChunkingConfig>())?.let {
                                ChunkingConfig(character = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TokenChunkingConfig>())?.let {
                                ChunkingConfig(token = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SentenceChunkingConfig>())?.let {
                                ChunkingConfig(sentence = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SemanticChunkingConfig>())?.let {
                                ChunkingConfig(semantic = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ChunkingConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ChunkingConfig>(ChunkingConfig::class) {

            override fun serialize(
                value: ChunkingConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.none != null -> generator.writeObject(value.none)
                    value.character != null -> generator.writeObject(value.character)
                    value.token != null -> generator.writeObject(value.token)
                    value.sentence != null -> generator.writeObject(value.sentence)
                    value.semantic != null -> generator.writeObject(value.semantic)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ChunkingConfig")
                }
            }
        }

        class NoneChunkingConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mode: JsonField<Mode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of()
            ) : this(mode, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NoneChunkingConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NoneChunkingConfig]. */
            class Builder internal constructor() {

                private var mode: JsonField<Mode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(noneChunkingConfig: NoneChunkingConfig) = apply {
                    mode = noneChunkingConfig.mode
                    additionalProperties = noneChunkingConfig.additionalProperties.toMutableMap()
                }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NoneChunkingConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NoneChunkingConfig =
                    NoneChunkingConfig(mode, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): NoneChunkingConfig = apply {
                if (validated) {
                    return@apply
                }

                mode().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (mode.asKnown().getOrNull()?.validity() ?: 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("none")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    NONE
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NoneChunkingConfig &&
                    mode == other.mode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(mode, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NoneChunkingConfig{mode=$mode, additionalProperties=$additionalProperties}"
        }

        class CharacterChunkingConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chunkOverlap: JsonField<Long>,
            private val chunkSize: JsonField<Long>,
            private val mode: JsonField<Mode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chunk_overlap")
                @ExcludeMissing
                chunkOverlap: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_size")
                @ExcludeMissing
                chunkSize: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            ) : this(chunkOverlap, chunkSize, mode, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkOverlap(): Optional<Long> = chunkOverlap.getOptional("chunk_overlap")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkSize(): Optional<Long> = chunkSize.getOptional("chunk_size")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Returns the raw JSON value of [chunkOverlap].
             *
             * Unlike [chunkOverlap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_overlap")
            @ExcludeMissing
            fun _chunkOverlap(): JsonField<Long> = chunkOverlap

            /**
             * Returns the raw JSON value of [chunkSize].
             *
             * Unlike [chunkSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_size")
            @ExcludeMissing
            fun _chunkSize(): JsonField<Long> = chunkSize

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CharacterChunkingConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CharacterChunkingConfig]. */
            class Builder internal constructor() {

                private var chunkOverlap: JsonField<Long> = JsonMissing.of()
                private var chunkSize: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(characterChunkingConfig: CharacterChunkingConfig) = apply {
                    chunkOverlap = characterChunkingConfig.chunkOverlap
                    chunkSize = characterChunkingConfig.chunkSize
                    mode = characterChunkingConfig.mode
                    additionalProperties =
                        characterChunkingConfig.additionalProperties.toMutableMap()
                }

                fun chunkOverlap(chunkOverlap: Long) = chunkOverlap(JsonField.of(chunkOverlap))

                /**
                 * Sets [Builder.chunkOverlap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkOverlap] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkOverlap(chunkOverlap: JsonField<Long>) = apply {
                    this.chunkOverlap = chunkOverlap
                }

                fun chunkSize(chunkSize: Long) = chunkSize(JsonField.of(chunkSize))

                /**
                 * Sets [Builder.chunkSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkSize(chunkSize: JsonField<Long>) = apply { this.chunkSize = chunkSize }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CharacterChunkingConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CharacterChunkingConfig =
                    CharacterChunkingConfig(
                        chunkOverlap,
                        chunkSize,
                        mode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CharacterChunkingConfig = apply {
                if (validated) {
                    return@apply
                }

                chunkOverlap()
                chunkSize()
                mode().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (chunkOverlap.asKnown().isPresent) 1 else 0) +
                    (if (chunkSize.asKnown().isPresent) 1 else 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHARACTER = of("character")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    CHARACTER
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHARACTER,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHARACTER -> Value.CHARACTER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHARACTER -> Known.CHARACTER
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CharacterChunkingConfig &&
                    chunkOverlap == other.chunkOverlap &&
                    chunkSize == other.chunkSize &&
                    mode == other.mode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(chunkOverlap, chunkSize, mode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CharacterChunkingConfig{chunkOverlap=$chunkOverlap, chunkSize=$chunkSize, mode=$mode, additionalProperties=$additionalProperties}"
        }

        class TokenChunkingConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chunkOverlap: JsonField<Long>,
            private val chunkSize: JsonField<Long>,
            private val mode: JsonField<Mode>,
            private val separator: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chunk_overlap")
                @ExcludeMissing
                chunkOverlap: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_size")
                @ExcludeMissing
                chunkSize: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("separator")
                @ExcludeMissing
                separator: JsonField<String> = JsonMissing.of(),
            ) : this(chunkOverlap, chunkSize, mode, separator, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkOverlap(): Optional<Long> = chunkOverlap.getOptional("chunk_overlap")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkSize(): Optional<Long> = chunkSize.getOptional("chunk_size")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun separator(): Optional<String> = separator.getOptional("separator")

            /**
             * Returns the raw JSON value of [chunkOverlap].
             *
             * Unlike [chunkOverlap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_overlap")
            @ExcludeMissing
            fun _chunkOverlap(): JsonField<Long> = chunkOverlap

            /**
             * Returns the raw JSON value of [chunkSize].
             *
             * Unlike [chunkSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_size")
            @ExcludeMissing
            fun _chunkSize(): JsonField<Long> = chunkSize

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [separator].
             *
             * Unlike [separator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("separator")
            @ExcludeMissing
            fun _separator(): JsonField<String> = separator

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TokenChunkingConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TokenChunkingConfig]. */
            class Builder internal constructor() {

                private var chunkOverlap: JsonField<Long> = JsonMissing.of()
                private var chunkSize: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var separator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tokenChunkingConfig: TokenChunkingConfig) = apply {
                    chunkOverlap = tokenChunkingConfig.chunkOverlap
                    chunkSize = tokenChunkingConfig.chunkSize
                    mode = tokenChunkingConfig.mode
                    separator = tokenChunkingConfig.separator
                    additionalProperties = tokenChunkingConfig.additionalProperties.toMutableMap()
                }

                fun chunkOverlap(chunkOverlap: Long) = chunkOverlap(JsonField.of(chunkOverlap))

                /**
                 * Sets [Builder.chunkOverlap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkOverlap] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkOverlap(chunkOverlap: JsonField<Long>) = apply {
                    this.chunkOverlap = chunkOverlap
                }

                fun chunkSize(chunkSize: Long) = chunkSize(JsonField.of(chunkSize))

                /**
                 * Sets [Builder.chunkSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkSize(chunkSize: JsonField<Long>) = apply { this.chunkSize = chunkSize }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun separator(separator: String) = separator(JsonField.of(separator))

                /**
                 * Sets [Builder.separator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.separator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun separator(separator: JsonField<String>) = apply { this.separator = separator }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TokenChunkingConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): TokenChunkingConfig =
                    TokenChunkingConfig(
                        chunkOverlap,
                        chunkSize,
                        mode,
                        separator,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TokenChunkingConfig = apply {
                if (validated) {
                    return@apply
                }

                chunkOverlap()
                chunkSize()
                mode().ifPresent { it.validate() }
                separator()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (chunkOverlap.asKnown().isPresent) 1 else 0) +
                    (if (chunkSize.asKnown().isPresent) 1 else 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (separator.asKnown().isPresent) 1 else 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TOKEN = of("token")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    TOKEN
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOKEN,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TOKEN -> Value.TOKEN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TOKEN -> Known.TOKEN
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TokenChunkingConfig &&
                    chunkOverlap == other.chunkOverlap &&
                    chunkSize == other.chunkSize &&
                    mode == other.mode &&
                    separator == other.separator &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(chunkOverlap, chunkSize, mode, separator, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TokenChunkingConfig{chunkOverlap=$chunkOverlap, chunkSize=$chunkSize, mode=$mode, separator=$separator, additionalProperties=$additionalProperties}"
        }

        class SentenceChunkingConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val chunkOverlap: JsonField<Long>,
            private val chunkSize: JsonField<Long>,
            private val mode: JsonField<Mode>,
            private val paragraphSeparator: JsonField<String>,
            private val separator: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chunk_overlap")
                @ExcludeMissing
                chunkOverlap: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_size")
                @ExcludeMissing
                chunkSize: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("paragraph_separator")
                @ExcludeMissing
                paragraphSeparator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("separator")
                @ExcludeMissing
                separator: JsonField<String> = JsonMissing.of(),
            ) : this(chunkOverlap, chunkSize, mode, paragraphSeparator, separator, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkOverlap(): Optional<Long> = chunkOverlap.getOptional("chunk_overlap")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chunkSize(): Optional<Long> = chunkSize.getOptional("chunk_size")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun paragraphSeparator(): Optional<String> =
                paragraphSeparator.getOptional("paragraph_separator")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun separator(): Optional<String> = separator.getOptional("separator")

            /**
             * Returns the raw JSON value of [chunkOverlap].
             *
             * Unlike [chunkOverlap], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_overlap")
            @ExcludeMissing
            fun _chunkOverlap(): JsonField<Long> = chunkOverlap

            /**
             * Returns the raw JSON value of [chunkSize].
             *
             * Unlike [chunkSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_size")
            @ExcludeMissing
            fun _chunkSize(): JsonField<Long> = chunkSize

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [paragraphSeparator].
             *
             * Unlike [paragraphSeparator], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("paragraph_separator")
            @ExcludeMissing
            fun _paragraphSeparator(): JsonField<String> = paragraphSeparator

            /**
             * Returns the raw JSON value of [separator].
             *
             * Unlike [separator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("separator")
            @ExcludeMissing
            fun _separator(): JsonField<String> = separator

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SentenceChunkingConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SentenceChunkingConfig]. */
            class Builder internal constructor() {

                private var chunkOverlap: JsonField<Long> = JsonMissing.of()
                private var chunkSize: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var paragraphSeparator: JsonField<String> = JsonMissing.of()
                private var separator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sentenceChunkingConfig: SentenceChunkingConfig) = apply {
                    chunkOverlap = sentenceChunkingConfig.chunkOverlap
                    chunkSize = sentenceChunkingConfig.chunkSize
                    mode = sentenceChunkingConfig.mode
                    paragraphSeparator = sentenceChunkingConfig.paragraphSeparator
                    separator = sentenceChunkingConfig.separator
                    additionalProperties =
                        sentenceChunkingConfig.additionalProperties.toMutableMap()
                }

                fun chunkOverlap(chunkOverlap: Long) = chunkOverlap(JsonField.of(chunkOverlap))

                /**
                 * Sets [Builder.chunkOverlap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkOverlap] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkOverlap(chunkOverlap: JsonField<Long>) = apply {
                    this.chunkOverlap = chunkOverlap
                }

                fun chunkSize(chunkSize: Long) = chunkSize(JsonField.of(chunkSize))

                /**
                 * Sets [Builder.chunkSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkSize(chunkSize: JsonField<Long>) = apply { this.chunkSize = chunkSize }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun paragraphSeparator(paragraphSeparator: String) =
                    paragraphSeparator(JsonField.of(paragraphSeparator))

                /**
                 * Sets [Builder.paragraphSeparator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paragraphSeparator] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paragraphSeparator(paragraphSeparator: JsonField<String>) = apply {
                    this.paragraphSeparator = paragraphSeparator
                }

                fun separator(separator: String) = separator(JsonField.of(separator))

                /**
                 * Sets [Builder.separator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.separator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun separator(separator: JsonField<String>) = apply { this.separator = separator }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SentenceChunkingConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SentenceChunkingConfig =
                    SentenceChunkingConfig(
                        chunkOverlap,
                        chunkSize,
                        mode,
                        paragraphSeparator,
                        separator,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SentenceChunkingConfig = apply {
                if (validated) {
                    return@apply
                }

                chunkOverlap()
                chunkSize()
                mode().ifPresent { it.validate() }
                paragraphSeparator()
                separator()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (chunkOverlap.asKnown().isPresent) 1 else 0) +
                    (if (chunkSize.asKnown().isPresent) 1 else 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (paragraphSeparator.asKnown().isPresent) 1 else 0) +
                    (if (separator.asKnown().isPresent) 1 else 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SENTENCE = of("sentence")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    SENTENCE
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SENTENCE,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SENTENCE -> Value.SENTENCE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SENTENCE -> Known.SENTENCE
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SentenceChunkingConfig &&
                    chunkOverlap == other.chunkOverlap &&
                    chunkSize == other.chunkSize &&
                    mode == other.mode &&
                    paragraphSeparator == other.paragraphSeparator &&
                    separator == other.separator &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    chunkOverlap,
                    chunkSize,
                    mode,
                    paragraphSeparator,
                    separator,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SentenceChunkingConfig{chunkOverlap=$chunkOverlap, chunkSize=$chunkSize, mode=$mode, paragraphSeparator=$paragraphSeparator, separator=$separator, additionalProperties=$additionalProperties}"
        }

        class SemanticChunkingConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val breakpointPercentileThreshold: JsonField<Long>,
            private val bufferSize: JsonField<Long>,
            private val mode: JsonField<Mode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("breakpoint_percentile_threshold")
                @ExcludeMissing
                breakpointPercentileThreshold: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("buffer_size")
                @ExcludeMissing
                bufferSize: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            ) : this(breakpointPercentileThreshold, bufferSize, mode, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun breakpointPercentileThreshold(): Optional<Long> =
                breakpointPercentileThreshold.getOptional("breakpoint_percentile_threshold")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun bufferSize(): Optional<Long> = bufferSize.getOptional("buffer_size")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Returns the raw JSON value of [breakpointPercentileThreshold].
             *
             * Unlike [breakpointPercentileThreshold], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("breakpoint_percentile_threshold")
            @ExcludeMissing
            fun _breakpointPercentileThreshold(): JsonField<Long> = breakpointPercentileThreshold

            /**
             * Returns the raw JSON value of [bufferSize].
             *
             * Unlike [bufferSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("buffer_size")
            @ExcludeMissing
            fun _bufferSize(): JsonField<Long> = bufferSize

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SemanticChunkingConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SemanticChunkingConfig]. */
            class Builder internal constructor() {

                private var breakpointPercentileThreshold: JsonField<Long> = JsonMissing.of()
                private var bufferSize: JsonField<Long> = JsonMissing.of()
                private var mode: JsonField<Mode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(semanticChunkingConfig: SemanticChunkingConfig) = apply {
                    breakpointPercentileThreshold =
                        semanticChunkingConfig.breakpointPercentileThreshold
                    bufferSize = semanticChunkingConfig.bufferSize
                    mode = semanticChunkingConfig.mode
                    additionalProperties =
                        semanticChunkingConfig.additionalProperties.toMutableMap()
                }

                fun breakpointPercentileThreshold(breakpointPercentileThreshold: Long) =
                    breakpointPercentileThreshold(JsonField.of(breakpointPercentileThreshold))

                /**
                 * Sets [Builder.breakpointPercentileThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.breakpointPercentileThreshold] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun breakpointPercentileThreshold(breakpointPercentileThreshold: JsonField<Long>) =
                    apply {
                        this.breakpointPercentileThreshold = breakpointPercentileThreshold
                    }

                fun bufferSize(bufferSize: Long) = bufferSize(JsonField.of(bufferSize))

                /**
                 * Sets [Builder.bufferSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bufferSize] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bufferSize(bufferSize: JsonField<Long>) = apply { this.bufferSize = bufferSize }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SemanticChunkingConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SemanticChunkingConfig =
                    SemanticChunkingConfig(
                        breakpointPercentileThreshold,
                        bufferSize,
                        mode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SemanticChunkingConfig = apply {
                if (validated) {
                    return@apply
                }

                breakpointPercentileThreshold()
                bufferSize()
                mode().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (breakpointPercentileThreshold.asKnown().isPresent) 1 else 0) +
                    (if (bufferSize.asKnown().isPresent) 1 else 0) +
                    (mode.asKnown().getOrNull()?.validity() ?: 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SEMANTIC = of("semantic")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    SEMANTIC
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SEMANTIC,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SEMANTIC -> Value.SEMANTIC
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SEMANTIC -> Known.SEMANTIC
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SemanticChunkingConfig &&
                    breakpointPercentileThreshold == other.breakpointPercentileThreshold &&
                    bufferSize == other.bufferSize &&
                    mode == other.mode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(breakpointPercentileThreshold, bufferSize, mode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SemanticChunkingConfig{breakpointPercentileThreshold=$breakpointPercentileThreshold, bufferSize=$bufferSize, mode=$mode, additionalProperties=$additionalProperties}"
        }
    }

    class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ADVANCED = of("advanced")

            @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
        }

        /** An enum containing [Mode]'s known values. */
        enum class Known {
            ADVANCED
        }

        /**
         * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Mode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADVANCED,
            /** An enum member indicating that [Mode] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ADVANCED -> Value.ADVANCED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ADVANCED -> Known.ADVANCED
                else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaCloudInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LlamaCloudInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Mode = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration for the segmentation. */
    @JsonDeserialize(using = SegmentationConfig.Deserializer::class)
    @JsonSerialize(using = SegmentationConfig.Serializer::class)
    class SegmentationConfig
    private constructor(
        private val none: NoneSegmentationConfig? = null,
        private val page: PageSegmentationConfig? = null,
        private val element: ElementSegmentationConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun none(): Optional<NoneSegmentationConfig> = Optional.ofNullable(none)

        fun page(): Optional<PageSegmentationConfig> = Optional.ofNullable(page)

        fun element(): Optional<ElementSegmentationConfig> = Optional.ofNullable(element)

        fun isNone(): Boolean = none != null

        fun isPage(): Boolean = page != null

        fun isElement(): Boolean = element != null

        fun asNone(): NoneSegmentationConfig = none.getOrThrow("none")

        fun asPage(): PageSegmentationConfig = page.getOrThrow("page")

        fun asElement(): ElementSegmentationConfig = element.getOrThrow("element")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import ai.llamaindex.llamacloud.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = segmentationConfig.accept(new SegmentationConfig.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNone(NoneSegmentationConfig none) {
         *         return Optional.of(none.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LlamaCloudInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                none != null -> visitor.visitNone(none)
                page != null -> visitor.visitPage(page)
                element != null -> visitor.visitElement(element)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SegmentationConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNone(none: NoneSegmentationConfig) {
                        none.validate()
                    }

                    override fun visitPage(page: PageSegmentationConfig) {
                        page.validate()
                    }

                    override fun visitElement(element: ElementSegmentationConfig) {
                        element.validate()
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNone(none: NoneSegmentationConfig) = none.validity()

                    override fun visitPage(page: PageSegmentationConfig) = page.validity()

                    override fun visitElement(element: ElementSegmentationConfig) =
                        element.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SegmentationConfig &&
                none == other.none &&
                page == other.page &&
                element == other.element
        }

        override fun hashCode(): Int = Objects.hash(none, page, element)

        override fun toString(): String =
            when {
                none != null -> "SegmentationConfig{none=$none}"
                page != null -> "SegmentationConfig{page=$page}"
                element != null -> "SegmentationConfig{element=$element}"
                _json != null -> "SegmentationConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SegmentationConfig")
            }

        companion object {

            @JvmStatic fun ofNone(none: NoneSegmentationConfig) = SegmentationConfig(none = none)

            @JvmStatic fun ofPage(page: PageSegmentationConfig) = SegmentationConfig(page = page)

            @JvmStatic
            fun ofElement(element: ElementSegmentationConfig) =
                SegmentationConfig(element = element)
        }

        /**
         * An interface that defines how to map each variant of [SegmentationConfig] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNone(none: NoneSegmentationConfig): T

            fun visitPage(page: PageSegmentationConfig): T

            fun visitElement(element: ElementSegmentationConfig): T

            /**
             * Maps an unknown variant of [SegmentationConfig] to a value of type [T].
             *
             * An instance of [SegmentationConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown SegmentationConfig: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<SegmentationConfig>(SegmentationConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SegmentationConfig {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<NoneSegmentationConfig>())?.let {
                                SegmentationConfig(none = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PageSegmentationConfig>())?.let {
                                SegmentationConfig(page = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ElementSegmentationConfig>())?.let {
                                SegmentationConfig(element = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> SegmentationConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SegmentationConfig>(SegmentationConfig::class) {

            override fun serialize(
                value: SegmentationConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.none != null -> generator.writeObject(value.none)
                    value.page != null -> generator.writeObject(value.page)
                    value.element != null -> generator.writeObject(value.element)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SegmentationConfig")
                }
            }
        }

        class NoneSegmentationConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mode: JsonField<Mode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of()
            ) : this(mode, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [NoneSegmentationConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NoneSegmentationConfig]. */
            class Builder internal constructor() {

                private var mode: JsonField<Mode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(noneSegmentationConfig: NoneSegmentationConfig) = apply {
                    mode = noneSegmentationConfig.mode
                    additionalProperties =
                        noneSegmentationConfig.additionalProperties.toMutableMap()
                }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NoneSegmentationConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NoneSegmentationConfig =
                    NoneSegmentationConfig(mode, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): NoneSegmentationConfig = apply {
                if (validated) {
                    return@apply
                }

                mode().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (mode.asKnown().getOrNull()?.validity() ?: 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("none")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    NONE
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NoneSegmentationConfig &&
                    mode == other.mode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(mode, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NoneSegmentationConfig{mode=$mode, additionalProperties=$additionalProperties}"
        }

        class PageSegmentationConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mode: JsonField<Mode>,
            private val pageSeparator: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
                @JsonProperty("page_separator")
                @ExcludeMissing
                pageSeparator: JsonField<String> = JsonMissing.of(),
            ) : this(mode, pageSeparator, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pageSeparator(): Optional<String> = pageSeparator.getOptional("page_separator")

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            /**
             * Returns the raw JSON value of [pageSeparator].
             *
             * Unlike [pageSeparator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("page_separator")
            @ExcludeMissing
            fun _pageSeparator(): JsonField<String> = pageSeparator

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PageSegmentationConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PageSegmentationConfig]. */
            class Builder internal constructor() {

                private var mode: JsonField<Mode> = JsonMissing.of()
                private var pageSeparator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pageSegmentationConfig: PageSegmentationConfig) = apply {
                    mode = pageSegmentationConfig.mode
                    pageSeparator = pageSegmentationConfig.pageSeparator
                    additionalProperties =
                        pageSegmentationConfig.additionalProperties.toMutableMap()
                }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun pageSeparator(pageSeparator: String) =
                    pageSeparator(JsonField.of(pageSeparator))

                /**
                 * Sets [Builder.pageSeparator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageSeparator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageSeparator(pageSeparator: JsonField<String>) = apply {
                    this.pageSeparator = pageSeparator
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PageSegmentationConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PageSegmentationConfig =
                    PageSegmentationConfig(mode, pageSeparator, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PageSegmentationConfig = apply {
                if (validated) {
                    return@apply
                }

                mode().ifPresent { it.validate() }
                pageSeparator()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (pageSeparator.asKnown().isPresent) 1 else 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PAGE = of("page")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    PAGE
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PAGE,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PAGE -> Value.PAGE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PAGE -> Known.PAGE
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PageSegmentationConfig &&
                    mode == other.mode &&
                    pageSeparator == other.pageSeparator &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(mode, pageSeparator, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PageSegmentationConfig{mode=$mode, pageSeparator=$pageSeparator, additionalProperties=$additionalProperties}"
        }

        class ElementSegmentationConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mode: JsonField<Mode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of()
            ) : this(mode, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun mode(): Optional<Mode> = mode.getOptional("mode")

            /**
             * Returns the raw JSON value of [mode].
             *
             * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ElementSegmentationConfig].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ElementSegmentationConfig]. */
            class Builder internal constructor() {

                private var mode: JsonField<Mode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(elementSegmentationConfig: ElementSegmentationConfig) = apply {
                    mode = elementSegmentationConfig.mode
                    additionalProperties =
                        elementSegmentationConfig.additionalProperties.toMutableMap()
                }

                fun mode(mode: Mode) = mode(JsonField.of(mode))

                /**
                 * Sets [Builder.mode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mode] with a well-typed [Mode] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ElementSegmentationConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ElementSegmentationConfig =
                    ElementSegmentationConfig(mode, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LlamaCloudInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ElementSegmentationConfig = apply {
                if (validated) {
                    return@apply
                }

                mode().ifPresent { it.validate() }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = (mode.asKnown().getOrNull()?.validity() ?: 0)

            class Mode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ELEMENT = of("element")

                    @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
                }

                /** An enum containing [Mode]'s known values. */
                enum class Known {
                    ELEMENT
                }

                /**
                 * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Mode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ELEMENT,
                    /**
                     * An enum member indicating that [Mode] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ELEMENT -> Value.ELEMENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ELEMENT -> Known.ELEMENT
                        else -> throw LlamaCloudInvalidDataException("Unknown Mode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LlamaCloudInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LlamaCloudInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Mode = apply {
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mode && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ElementSegmentationConfig &&
                    mode == other.mode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(mode, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ElementSegmentationConfig{mode=$mode, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AdvancedModeTransformConfig &&
            chunkingConfig == other.chunkingConfig &&
            mode == other.mode &&
            segmentationConfig == other.segmentationConfig &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chunkingConfig, mode, segmentationConfig, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AdvancedModeTransformConfig{chunkingConfig=$chunkingConfig, mode=$mode, segmentationConfig=$segmentationConfig, additionalProperties=$additionalProperties}"
}
