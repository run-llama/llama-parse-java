// File generated from our OpenAPI spec by Stainless.

package com.llamacloud_prod.api.models.beta.chat

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
import com.llamacloud_prod.api.core.BaseDeserializer
import com.llamacloud_prod.api.core.BaseSerializer
import com.llamacloud_prod.api.core.Enum
import com.llamacloud_prod.api.core.ExcludeMissing
import com.llamacloud_prod.api.core.JsonField
import com.llamacloud_prod.api.core.JsonMissing
import com.llamacloud_prod.api.core.JsonValue
import com.llamacloud_prod.api.core.checkKnown
import com.llamacloud_prod.api.core.checkRequired
import com.llamacloud_prod.api.core.getOrThrow
import com.llamacloud_prod.api.core.toImmutable
import com.llamacloud_prod.api.errors.LlamaCloudInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Full chat session including its complete event history. */
class ChatRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val events: JsonField<List<Event>>,
    private val lastUpdatedAt: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val generatedTitle: JsonField<String>,
    private val indexIds: JsonField<List<String>>,
    private val jobMetadata: JsonField<JobMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("events") @ExcludeMissing events: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("last_updated_at")
        @ExcludeMissing
        lastUpdatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("generated_title")
        @ExcludeMissing
        generatedTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index_ids")
        @ExcludeMissing
        indexIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("job_metadata")
        @ExcludeMissing
        jobMetadata: JsonField<JobMetadata> = JsonMissing.of(),
    ) : this(
        events,
        lastUpdatedAt,
        sessionId,
        generatedTitle,
        indexIds,
        jobMetadata,
        mutableMapOf(),
    )

    /**
     * Ordered list of events that make up the conversation history.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun events(): List<Event> = events.getRequired("events")

    /**
     * ISO-format timestamp showing when the session was last updated.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastUpdatedAt(): String = lastUpdatedAt.getRequired("last_updated_at")

    /**
     * Unique session identifier.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * Auto-generated title derived from the first user message.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generatedTitle(): Optional<String> = generatedTitle.getOptional("generated_title")

    /**
     * Indexes this session is bound to. Null on unbound sessions.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun indexIds(): Optional<List<String>> = indexIds.getOptional("index_ids")

    /**
     * Token usage and status from the most recent run. Null if the session has not been run yet.
     *
     * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobMetadata(): Optional<JobMetadata> = jobMetadata.getOptional("job_metadata")

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

    /**
     * Returns the raw JSON value of [lastUpdatedAt].
     *
     * Unlike [lastUpdatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_updated_at")
    @ExcludeMissing
    fun _lastUpdatedAt(): JsonField<String> = lastUpdatedAt

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [generatedTitle].
     *
     * Unlike [generatedTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("generated_title")
    @ExcludeMissing
    fun _generatedTitle(): JsonField<String> = generatedTitle

    /**
     * Returns the raw JSON value of [indexIds].
     *
     * Unlike [indexIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index_ids") @ExcludeMissing fun _indexIds(): JsonField<List<String>> = indexIds

    /**
     * Returns the raw JSON value of [jobMetadata].
     *
     * Unlike [jobMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_metadata")
    @ExcludeMissing
    fun _jobMetadata(): JsonField<JobMetadata> = jobMetadata

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
         * Returns a mutable builder for constructing an instance of [ChatRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .events()
         * .lastUpdatedAt()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChatRetrieveResponse]. */
    class Builder internal constructor() {

        private var events: JsonField<MutableList<Event>>? = null
        private var lastUpdatedAt: JsonField<String>? = null
        private var sessionId: JsonField<String>? = null
        private var generatedTitle: JsonField<String> = JsonMissing.of()
        private var indexIds: JsonField<MutableList<String>>? = null
        private var jobMetadata: JsonField<JobMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chatRetrieveResponse: ChatRetrieveResponse) = apply {
            events = chatRetrieveResponse.events.map { it.toMutableList() }
            lastUpdatedAt = chatRetrieveResponse.lastUpdatedAt
            sessionId = chatRetrieveResponse.sessionId
            generatedTitle = chatRetrieveResponse.generatedTitle
            indexIds = chatRetrieveResponse.indexIds.map { it.toMutableList() }
            jobMetadata = chatRetrieveResponse.jobMetadata
            additionalProperties = chatRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Ordered list of events that make up the conversation history. */
        fun events(events: List<Event>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        /** Alias for calling [addEvent] with `Event.ofThinkingDelta(thinkingDelta)`. */
        fun addEvent(thinkingDelta: Event.ThinkingDelta) =
            addEvent(Event.ofThinkingDelta(thinkingDelta))

        /**
         * Alias for calling [addEvent] with the following:
         * ```java
         * Event.ThinkingDelta.builder()
         *     .type(ChatRetrieveResponse.Event.ThinkingDelta.Type.THINKING_DELTA)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addThinkingDeltaEvent(content: String) =
            addEvent(
                Event.ThinkingDelta.builder()
                    .type(ChatRetrieveResponse.Event.ThinkingDelta.Type.THINKING_DELTA)
                    .content(content)
                    .build()
            )

        /** Alias for calling [addEvent] with `Event.ofTextDelta(textDelta)`. */
        fun addEvent(textDelta: Event.TextDelta) = addEvent(Event.ofTextDelta(textDelta))

        /**
         * Alias for calling [addEvent] with the following:
         * ```java
         * Event.TextDelta.builder()
         *     .type(ChatRetrieveResponse.Event.TextDelta.Type.TEXT_DELTA)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addTextDeltaEvent(content: String) =
            addEvent(
                Event.TextDelta.builder()
                    .type(ChatRetrieveResponse.Event.TextDelta.Type.TEXT_DELTA)
                    .content(content)
                    .build()
            )

        /** Alias for calling [addEvent] with `Event.ofThinking(thinking)`. */
        fun addEvent(thinking: Event.Thinking) = addEvent(Event.ofThinking(thinking))

        /**
         * Alias for calling [addEvent] with the following:
         * ```java
         * Event.Thinking.builder()
         *     .type(ChatRetrieveResponse.Event.Thinking.Type.THINKING)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addThinkingEvent(content: String) =
            addEvent(
                Event.Thinking.builder()
                    .type(ChatRetrieveResponse.Event.Thinking.Type.THINKING)
                    .content(content)
                    .build()
            )

        /** Alias for calling [addEvent] with `Event.ofText(text)`. */
        fun addEvent(text: Event.Text) = addEvent(Event.ofText(text))

        /**
         * Alias for calling [addEvent] with the following:
         * ```java
         * Event.Text.builder()
         *     .type(ChatRetrieveResponse.Event.Text.Type.TEXT)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addTextEvent(content: String) =
            addEvent(
                Event.Text.builder()
                    .type(ChatRetrieveResponse.Event.Text.Type.TEXT)
                    .content(content)
                    .build()
            )

        /** Alias for calling [addEvent] with `Event.ofToolCall(toolCall)`. */
        fun addEvent(toolCall: Event.ToolCall) = addEvent(Event.ofToolCall(toolCall))

        /** Alias for calling [addEvent] with `Event.ofToolResult(toolResult)`. */
        fun addEvent(toolResult: Event.ToolResult) = addEvent(Event.ofToolResult(toolResult))

        /** Alias for calling [addEvent] with `Event.ofStop(stop)`. */
        fun addEvent(stop: Event.Stop) = addEvent(Event.ofStop(stop))

        /** Alias for calling [addEvent] with `Event.ofUserInput(userInput)`. */
        fun addEvent(userInput: Event.UserInput) = addEvent(Event.ofUserInput(userInput))

        /**
         * Alias for calling [addEvent] with the following:
         * ```java
         * Event.UserInput.builder()
         *     .type(ChatRetrieveResponse.Event.UserInput.Type.USER_INPUT)
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserInputEvent(content: String) =
            addEvent(
                Event.UserInput.builder()
                    .type(ChatRetrieveResponse.Event.UserInput.Type.USER_INPUT)
                    .content(content)
                    .build()
            )

        /** ISO-format timestamp showing when the session was last updated. */
        fun lastUpdatedAt(lastUpdatedAt: String) = lastUpdatedAt(JsonField.of(lastUpdatedAt))

        /**
         * Sets [Builder.lastUpdatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastUpdatedAt(lastUpdatedAt: JsonField<String>) = apply {
            this.lastUpdatedAt = lastUpdatedAt
        }

        /** Unique session identifier. */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** Auto-generated title derived from the first user message. */
        fun generatedTitle(generatedTitle: String?) =
            generatedTitle(JsonField.ofNullable(generatedTitle))

        /** Alias for calling [Builder.generatedTitle] with `generatedTitle.orElse(null)`. */
        fun generatedTitle(generatedTitle: Optional<String>) =
            generatedTitle(generatedTitle.getOrNull())

        /**
         * Sets [Builder.generatedTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generatedTitle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun generatedTitle(generatedTitle: JsonField<String>) = apply {
            this.generatedTitle = generatedTitle
        }

        /** Indexes this session is bound to. Null on unbound sessions. */
        fun indexIds(indexIds: List<String>?) = indexIds(JsonField.ofNullable(indexIds))

        /** Alias for calling [Builder.indexIds] with `indexIds.orElse(null)`. */
        fun indexIds(indexIds: Optional<List<String>>) = indexIds(indexIds.getOrNull())

        /**
         * Sets [Builder.indexIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexIds(indexIds: JsonField<List<String>>) = apply {
            this.indexIds = indexIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [indexIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIndexId(indexId: String) = apply {
            indexIds =
                (indexIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("indexIds", it).add(indexId)
                }
        }

        /**
         * Token usage and status from the most recent run. Null if the session has not been run
         * yet.
         */
        fun jobMetadata(jobMetadata: JobMetadata?) = jobMetadata(JsonField.ofNullable(jobMetadata))

        /** Alias for calling [Builder.jobMetadata] with `jobMetadata.orElse(null)`. */
        fun jobMetadata(jobMetadata: Optional<JobMetadata>) = jobMetadata(jobMetadata.getOrNull())

        /**
         * Sets [Builder.jobMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobMetadata] with a well-typed [JobMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun jobMetadata(jobMetadata: JsonField<JobMetadata>) = apply {
            this.jobMetadata = jobMetadata
        }

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
         * Returns an immutable instance of [ChatRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .events()
         * .lastUpdatedAt()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChatRetrieveResponse =
            ChatRetrieveResponse(
                checkRequired("events", events).map { it.toImmutable() },
                checkRequired("lastUpdatedAt", lastUpdatedAt),
                checkRequired("sessionId", sessionId),
                generatedTitle,
                (indexIds ?: JsonMissing.of()).map { it.toImmutable() },
                jobMetadata,
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
    fun validate(): ChatRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        events().forEach { it.validate() }
        lastUpdatedAt()
        sessionId()
        generatedTitle()
        indexIds()
        jobMetadata().ifPresent { it.validate() }
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
        (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (lastUpdatedAt.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (generatedTitle.asKnown().isPresent) 1 else 0) +
            (indexIds.asKnown().getOrNull()?.size ?: 0) +
            (jobMetadata.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event
    private constructor(
        private val thinkingDelta: ThinkingDelta? = null,
        private val textDelta: TextDelta? = null,
        private val thinking: Thinking? = null,
        private val text: Text? = null,
        private val toolCall: ToolCall? = null,
        private val toolResult: ToolResult? = null,
        private val stop: Stop? = null,
        private val userInput: UserInput? = null,
        private val _json: JsonValue? = null,
    ) {

        fun thinkingDelta(): Optional<ThinkingDelta> = Optional.ofNullable(thinkingDelta)

        fun textDelta(): Optional<TextDelta> = Optional.ofNullable(textDelta)

        fun thinking(): Optional<Thinking> = Optional.ofNullable(thinking)

        fun text(): Optional<Text> = Optional.ofNullable(text)

        fun toolCall(): Optional<ToolCall> = Optional.ofNullable(toolCall)

        fun toolResult(): Optional<ToolResult> = Optional.ofNullable(toolResult)

        fun stop(): Optional<Stop> = Optional.ofNullable(stop)

        fun userInput(): Optional<UserInput> = Optional.ofNullable(userInput)

        fun isThinkingDelta(): Boolean = thinkingDelta != null

        fun isTextDelta(): Boolean = textDelta != null

        fun isThinking(): Boolean = thinking != null

        fun isText(): Boolean = text != null

        fun isToolCall(): Boolean = toolCall != null

        fun isToolResult(): Boolean = toolResult != null

        fun isStop(): Boolean = stop != null

        fun isUserInput(): Boolean = userInput != null

        fun asThinkingDelta(): ThinkingDelta = thinkingDelta.getOrThrow("thinkingDelta")

        fun asTextDelta(): TextDelta = textDelta.getOrThrow("textDelta")

        fun asThinking(): Thinking = thinking.getOrThrow("thinking")

        fun asText(): Text = text.getOrThrow("text")

        fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

        fun asToolResult(): ToolResult = toolResult.getOrThrow("toolResult")

        fun asStop(): Stop = stop.getOrThrow("stop")

        fun asUserInput(): UserInput = userInput.getOrThrow("userInput")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.llamacloud_prod.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = event.accept(new Event.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitThinkingDelta(ThinkingDelta thinkingDelta) {
         *         return Optional.of(thinkingDelta.toString());
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
                thinkingDelta != null -> visitor.visitThinkingDelta(thinkingDelta)
                textDelta != null -> visitor.visitTextDelta(textDelta)
                thinking != null -> visitor.visitThinking(thinking)
                text != null -> visitor.visitText(text)
                toolCall != null -> visitor.visitToolCall(toolCall)
                toolResult != null -> visitor.visitToolResult(toolResult)
                stop != null -> visitor.visitStop(stop)
                userInput != null -> visitor.visitUserInput(userInput)
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
        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitThinkingDelta(thinkingDelta: ThinkingDelta) {
                        thinkingDelta.validate()
                    }

                    override fun visitTextDelta(textDelta: TextDelta) {
                        textDelta.validate()
                    }

                    override fun visitThinking(thinking: Thinking) {
                        thinking.validate()
                    }

                    override fun visitText(text: Text) {
                        text.validate()
                    }

                    override fun visitToolCall(toolCall: ToolCall) {
                        toolCall.validate()
                    }

                    override fun visitToolResult(toolResult: ToolResult) {
                        toolResult.validate()
                    }

                    override fun visitStop(stop: Stop) {
                        stop.validate()
                    }

                    override fun visitUserInput(userInput: UserInput) {
                        userInput.validate()
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
                    override fun visitThinkingDelta(thinkingDelta: ThinkingDelta) =
                        thinkingDelta.validity()

                    override fun visitTextDelta(textDelta: TextDelta) = textDelta.validity()

                    override fun visitThinking(thinking: Thinking) = thinking.validity()

                    override fun visitText(text: Text) = text.validity()

                    override fun visitToolCall(toolCall: ToolCall) = toolCall.validity()

                    override fun visitToolResult(toolResult: ToolResult) = toolResult.validity()

                    override fun visitStop(stop: Stop) = stop.validity()

                    override fun visitUserInput(userInput: UserInput) = userInput.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Event &&
                thinkingDelta == other.thinkingDelta &&
                textDelta == other.textDelta &&
                thinking == other.thinking &&
                text == other.text &&
                toolCall == other.toolCall &&
                toolResult == other.toolResult &&
                stop == other.stop &&
                userInput == other.userInput
        }

        override fun hashCode(): Int =
            Objects.hash(
                thinkingDelta,
                textDelta,
                thinking,
                text,
                toolCall,
                toolResult,
                stop,
                userInput,
            )

        override fun toString(): String =
            when {
                thinkingDelta != null -> "Event{thinkingDelta=$thinkingDelta}"
                textDelta != null -> "Event{textDelta=$textDelta}"
                thinking != null -> "Event{thinking=$thinking}"
                text != null -> "Event{text=$text}"
                toolCall != null -> "Event{toolCall=$toolCall}"
                toolResult != null -> "Event{toolResult=$toolResult}"
                stop != null -> "Event{stop=$stop}"
                userInput != null -> "Event{userInput=$userInput}"
                _json != null -> "Event{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Event")
            }

        companion object {

            @JvmStatic
            fun ofThinkingDelta(thinkingDelta: ThinkingDelta) = Event(thinkingDelta = thinkingDelta)

            @JvmStatic fun ofTextDelta(textDelta: TextDelta) = Event(textDelta = textDelta)

            @JvmStatic fun ofThinking(thinking: Thinking) = Event(thinking = thinking)

            @JvmStatic fun ofText(text: Text) = Event(text = text)

            @JvmStatic fun ofToolCall(toolCall: ToolCall) = Event(toolCall = toolCall)

            @JvmStatic fun ofToolResult(toolResult: ToolResult) = Event(toolResult = toolResult)

            @JvmStatic fun ofStop(stop: Stop) = Event(stop = stop)

            @JvmStatic fun ofUserInput(userInput: UserInput) = Event(userInput = userInput)
        }

        /** An interface that defines how to map each variant of [Event] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitThinkingDelta(thinkingDelta: ThinkingDelta): T

            fun visitTextDelta(textDelta: TextDelta): T

            fun visitThinking(thinking: Thinking): T

            fun visitText(text: Text): T

            fun visitToolCall(toolCall: ToolCall): T

            fun visitToolResult(toolResult: ToolResult): T

            fun visitStop(stop: Stop): T

            fun visitUserInput(userInput: UserInput): T

            /**
             * Maps an unknown variant of [Event] to a value of type [T].
             *
             * An instance of [Event] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaCloudInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaCloudInvalidDataException("Unknown Event: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "thinking_delta" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThinkingDelta>())?.let {
                            Event(thinkingDelta = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "text_delta" -> {
                        return tryDeserialize(node, jacksonTypeRef<TextDelta>())?.let {
                            Event(textDelta = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "thinking" -> {
                        return tryDeserialize(node, jacksonTypeRef<Thinking>())?.let {
                            Event(thinking = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "text" -> {
                        return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                            Event(text = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "tool_call" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolCall>())?.let {
                            Event(toolCall = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "tool_result" -> {
                        return tryDeserialize(node, jacksonTypeRef<ToolResult>())?.let {
                            Event(toolResult = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "stop" -> {
                        return tryDeserialize(node, jacksonTypeRef<Stop>())?.let {
                            Event(stop = it, _json = json)
                        } ?: Event(_json = json)
                    }
                    "user_input" -> {
                        return tryDeserialize(node, jacksonTypeRef<UserInput>())?.let {
                            Event(userInput = it, _json = json)
                        } ?: Event(_json = json)
                    }
                }

                return Event(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Event>(Event::class) {

            override fun serialize(
                value: Event,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.thinkingDelta != null -> generator.writeObject(value.thinkingDelta)
                    value.textDelta != null -> generator.writeObject(value.textDelta)
                    value.thinking != null -> generator.writeObject(value.thinking)
                    value.text != null -> generator.writeObject(value.text)
                    value.toolCall != null -> generator.writeObject(value.toolCall)
                    value.toolResult != null -> generator.writeObject(value.toolResult)
                    value.stop != null -> generator.writeObject(value.stop)
                    value.userInput != null -> generator.writeObject(value.userInput)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }

        class ThinkingDelta
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ThinkingDelta].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ThinkingDelta]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(thinkingDelta: ThinkingDelta) = apply {
                    content = thinkingDelta.content
                    type = thinkingDelta.type
                    additionalProperties = thinkingDelta.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [ThinkingDelta].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ThinkingDelta =
                    ThinkingDelta(
                        checkRequired("content", content),
                        type,
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
            fun validate(): ThinkingDelta = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val THINKING_DELTA = of("thinking_delta")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    THINKING_DELTA
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    THINKING_DELTA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        THINKING_DELTA -> Value.THINKING_DELTA
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
                        THINKING_DELTA -> Known.THINKING_DELTA
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ThinkingDelta &&
                    content == other.content &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThinkingDelta{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        class TextDelta
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [TextDelta].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TextDelta]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(textDelta: TextDelta) = apply {
                    content = textDelta.content
                    type = textDelta.type
                    additionalProperties = textDelta.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [TextDelta].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TextDelta =
                    TextDelta(
                        checkRequired("content", content),
                        type,
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
            fun validate(): TextDelta = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TEXT_DELTA = of("text_delta")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TEXT_DELTA
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEXT_DELTA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TEXT_DELTA -> Value.TEXT_DELTA
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
                        TEXT_DELTA -> Known.TEXT_DELTA
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TextDelta &&
                    content == other.content &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TextDelta{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        class Thinking
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Thinking].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Thinking]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(thinking: Thinking) = apply {
                    content = thinking.content
                    type = thinking.type
                    additionalProperties = thinking.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Thinking].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Thinking =
                    Thinking(
                        checkRequired("content", content),
                        type,
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
            fun validate(): Thinking = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val THINKING = of("thinking")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    THINKING
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    THINKING,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        THINKING -> Value.THINKING
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
                        THINKING -> Known.THINKING
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Thinking &&
                    content == other.content &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Thinking{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        class Text
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Text].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Text]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(text: Text) = apply {
                    content = text.content
                    type = text.type
                    additionalProperties = text.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Text].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Text =
                    Text(
                        checkRequired("content", content),
                        type,
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
            fun validate(): Text = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TEXT = of("text")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TEXT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TEXT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TEXT -> Value.TEXT
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
                        TEXT -> Known.TEXT
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Text &&
                    content == other.content &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Text{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }

        class ToolCall
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val arguments: JsonField<Arguments>,
            private val callId: JsonField<String>,
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("arguments")
                @ExcludeMissing
                arguments: JsonField<Arguments> = JsonMissing.of(),
                @JsonProperty("call_id")
                @ExcludeMissing
                callId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(arguments, callId, name, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun arguments(): Arguments = arguments.getRequired("arguments")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun callId(): String = callId.getRequired("call_id")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [arguments].
             *
             * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("arguments")
            @ExcludeMissing
            fun _arguments(): JsonField<Arguments> = arguments

            /**
             * Returns the raw JSON value of [callId].
             *
             * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ToolCall].
                 *
                 * The following fields are required:
                 * ```java
                 * .arguments()
                 * .callId()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ToolCall]. */
            class Builder internal constructor() {

                private var arguments: JsonField<Arguments>? = null
                private var callId: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toolCall: ToolCall) = apply {
                    arguments = toolCall.arguments
                    callId = toolCall.callId
                    name = toolCall.name
                    type = toolCall.type
                    additionalProperties = toolCall.additionalProperties.toMutableMap()
                }

                fun arguments(arguments: Arguments) = arguments(JsonField.of(arguments))

                /**
                 * Sets [Builder.arguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arguments] with a well-typed [Arguments] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun arguments(arguments: JsonField<Arguments>) = apply {
                    this.arguments = arguments
                }

                fun callId(callId: String) = callId(JsonField.of(callId))

                /**
                 * Sets [Builder.callId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [ToolCall].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .arguments()
                 * .callId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ToolCall =
                    ToolCall(
                        checkRequired("arguments", arguments),
                        checkRequired("callId", callId),
                        checkRequired("name", name),
                        type,
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
            fun validate(): ToolCall = apply {
                if (validated) {
                    return@apply
                }

                arguments().validate()
                callId()
                name()
                type().ifPresent { it.validate() }
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
                (arguments.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (callId.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Arguments
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Arguments]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Arguments]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(arguments: Arguments) = apply {
                        additionalProperties = arguments.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Arguments].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Arguments = Arguments(additionalProperties.toImmutable())
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
                fun validate(): Arguments = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Arguments && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Arguments{additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TOOL_CALL = of("tool_call")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TOOL_CALL
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL_CALL,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TOOL_CALL -> Value.TOOL_CALL
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
                        TOOL_CALL -> Known.TOOL_CALL
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolCall &&
                    arguments == other.arguments &&
                    callId == other.callId &&
                    name == other.name &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(arguments, callId, name, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ToolCall{arguments=$arguments, callId=$callId, name=$name, type=$type, additionalProperties=$additionalProperties}"
        }

        class ToolResult
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val callId: JsonField<String>,
            private val name: JsonField<String>,
            private val result: JsonValue,
            private val imageAttachment: JsonField<ImageAttachment>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("call_id")
                @ExcludeMissing
                callId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("result") @ExcludeMissing result: JsonValue = JsonMissing.of(),
                @JsonProperty("image_attachment")
                @ExcludeMissing
                imageAttachment: JsonField<ImageAttachment> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(callId, name, result, imageAttachment, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun callId(): String = callId.getRequired("call_id")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = toolResult.result().convert(MyClass.class);
             * ```
             */
            @JsonProperty("result") @ExcludeMissing fun _result(): JsonValue = result

            /**
             * Coordinates for lazily resolving a page screenshot presigned URL.
             *
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun imageAttachment(): Optional<ImageAttachment> =
                imageAttachment.getOptional("image_attachment")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [callId].
             *
             * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [imageAttachment].
             *
             * Unlike [imageAttachment], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("image_attachment")
            @ExcludeMissing
            fun _imageAttachment(): JsonField<ImageAttachment> = imageAttachment

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [ToolResult].
                 *
                 * The following fields are required:
                 * ```java
                 * .callId()
                 * .name()
                 * .result()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ToolResult]. */
            class Builder internal constructor() {

                private var callId: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var result: JsonValue? = null
                private var imageAttachment: JsonField<ImageAttachment> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(toolResult: ToolResult) = apply {
                    callId = toolResult.callId
                    name = toolResult.name
                    result = toolResult.result
                    imageAttachment = toolResult.imageAttachment
                    type = toolResult.type
                    additionalProperties = toolResult.additionalProperties.toMutableMap()
                }

                fun callId(callId: String) = callId(JsonField.of(callId))

                /**
                 * Sets [Builder.callId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.callId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun callId(callId: JsonField<String>) = apply { this.callId = callId }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun result(result: JsonValue) = apply { this.result = result }

                /** Coordinates for lazily resolving a page screenshot presigned URL. */
                fun imageAttachment(imageAttachment: ImageAttachment?) =
                    imageAttachment(JsonField.ofNullable(imageAttachment))

                /**
                 * Alias for calling [Builder.imageAttachment] with `imageAttachment.orElse(null)`.
                 */
                fun imageAttachment(imageAttachment: Optional<ImageAttachment>) =
                    imageAttachment(imageAttachment.getOrNull())

                /**
                 * Sets [Builder.imageAttachment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.imageAttachment] with a well-typed
                 * [ImageAttachment] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun imageAttachment(imageAttachment: JsonField<ImageAttachment>) = apply {
                    this.imageAttachment = imageAttachment
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [ToolResult].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .callId()
                 * .name()
                 * .result()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ToolResult =
                    ToolResult(
                        checkRequired("callId", callId),
                        checkRequired("name", name),
                        checkRequired("result", result),
                        imageAttachment,
                        type,
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
            fun validate(): ToolResult = apply {
                if (validated) {
                    return@apply
                }

                callId()
                name()
                imageAttachment().ifPresent { it.validate() }
                type().ifPresent { it.validate() }
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
                (if (callId.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (imageAttachment.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Coordinates for lazily resolving a page screenshot presigned URL. */
            class ImageAttachment
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val attachmentName: JsonField<String>,
                private val sourceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attachment_name")
                    @ExcludeMissing
                    attachmentName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("source_id")
                    @ExcludeMissing
                    sourceId: JsonField<String> = JsonMissing.of(),
                ) : this(attachmentName, sourceId, mutableMapOf())

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attachmentName(): String = attachmentName.getRequired("attachment_name")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sourceId(): String = sourceId.getRequired("source_id")

                /**
                 * Returns the raw JSON value of [attachmentName].
                 *
                 * Unlike [attachmentName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attachment_name")
                @ExcludeMissing
                fun _attachmentName(): JsonField<String> = attachmentName

                /**
                 * Returns the raw JSON value of [sourceId].
                 *
                 * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("source_id")
                @ExcludeMissing
                fun _sourceId(): JsonField<String> = sourceId

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
                     * Returns a mutable builder for constructing an instance of [ImageAttachment].
                     *
                     * The following fields are required:
                     * ```java
                     * .attachmentName()
                     * .sourceId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ImageAttachment]. */
                class Builder internal constructor() {

                    private var attachmentName: JsonField<String>? = null
                    private var sourceId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(imageAttachment: ImageAttachment) = apply {
                        attachmentName = imageAttachment.attachmentName
                        sourceId = imageAttachment.sourceId
                        additionalProperties = imageAttachment.additionalProperties.toMutableMap()
                    }

                    fun attachmentName(attachmentName: String) =
                        attachmentName(JsonField.of(attachmentName))

                    /**
                     * Sets [Builder.attachmentName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attachmentName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attachmentName(attachmentName: JsonField<String>) = apply {
                        this.attachmentName = attachmentName
                    }

                    fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

                    /**
                     * Sets [Builder.sourceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sourceId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

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
                     * Returns an immutable instance of [ImageAttachment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attachmentName()
                     * .sourceId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ImageAttachment =
                        ImageAttachment(
                            checkRequired("attachmentName", attachmentName),
                            checkRequired("sourceId", sourceId),
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ImageAttachment = apply {
                    if (validated) {
                        return@apply
                    }

                    attachmentName()
                    sourceId()
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
                    (if (attachmentName.asKnown().isPresent) 1 else 0) +
                        (if (sourceId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ImageAttachment &&
                        attachmentName == other.attachmentName &&
                        sourceId == other.sourceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(attachmentName, sourceId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageAttachment{attachmentName=$attachmentName, sourceId=$sourceId, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val TOOL_RESULT = of("tool_result")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    TOOL_RESULT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TOOL_RESULT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        TOOL_RESULT -> Value.TOOL_RESULT
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
                        TOOL_RESULT -> Known.TOOL_RESULT
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolResult &&
                    callId == other.callId &&
                    name == other.name &&
                    result == other.result &&
                    imageAttachment == other.imageAttachment &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(callId, name, result, imageAttachment, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ToolResult{callId=$callId, name=$name, result=$result, imageAttachment=$imageAttachment, type=$type, additionalProperties=$additionalProperties}"
        }

        class Stop
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val error: JsonField<String>,
            private val isError: JsonField<Boolean>,
            private val usage: JsonField<Usage>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
                @JsonProperty("is_error")
                @ExcludeMissing
                isError: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(error, isError, usage, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun error(): Optional<String> = error.getOptional("error")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isError(): Boolean = isError.getRequired("is_error")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usage(): Usage = usage.getRequired("usage")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

            /**
             * Returns the raw JSON value of [isError].
             *
             * Unlike [isError], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_error") @ExcludeMissing fun _isError(): JsonField<Boolean> = isError

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [Stop].
                 *
                 * The following fields are required:
                 * ```java
                 * .error()
                 * .isError()
                 * .usage()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Stop]. */
            class Builder internal constructor() {

                private var error: JsonField<String>? = null
                private var isError: JsonField<Boolean>? = null
                private var usage: JsonField<Usage>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stop: Stop) = apply {
                    error = stop.error
                    isError = stop.isError
                    usage = stop.usage
                    type = stop.type
                    additionalProperties = stop.additionalProperties.toMutableMap()
                }

                fun error(error: String?) = error(JsonField.ofNullable(error))

                /** Alias for calling [Builder.error] with `error.orElse(null)`. */
                fun error(error: Optional<String>) = error(error.getOrNull())

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<String>) = apply { this.error = error }

                fun isError(isError: Boolean) = isError(JsonField.of(isError))

                /**
                 * Sets [Builder.isError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isError] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isError(isError: JsonField<Boolean>) = apply { this.isError = isError }

                fun usage(usage: Usage) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed [Usage] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Stop].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .error()
                 * .isError()
                 * .usage()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Stop =
                    Stop(
                        checkRequired("error", error),
                        checkRequired("isError", isError),
                        checkRequired("usage", usage),
                        type,
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
            fun validate(): Stop = apply {
                if (validated) {
                    return@apply
                }

                error()
                isError()
                usage().validate()
                type().ifPresent { it.validate() }
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
                (if (error.asKnown().isPresent) 1 else 0) +
                    (if (isError.asKnown().isPresent) 1 else 0) +
                    (usage.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Usage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val durationMs: JsonField<Double>,
                private val totalInputTokens: JsonField<Long>,
                private val totalOutputTokens: JsonField<Long>,
                private val turns: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("duration_ms")
                    @ExcludeMissing
                    durationMs: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("total_input_tokens")
                    @ExcludeMissing
                    totalInputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("total_output_tokens")
                    @ExcludeMissing
                    totalOutputTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("turns") @ExcludeMissing turns: JsonField<Long> = JsonMissing.of(),
                ) : this(durationMs, totalInputTokens, totalOutputTokens, turns, mutableMapOf())

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun durationMs(): Optional<Double> = durationMs.getOptional("duration_ms")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalInputTokens(): Optional<Long> =
                    totalInputTokens.getOptional("total_input_tokens")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalOutputTokens(): Optional<Long> =
                    totalOutputTokens.getOptional("total_output_tokens")

                /**
                 * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun turns(): Optional<Long> = turns.getOptional("turns")

                /**
                 * Returns the raw JSON value of [durationMs].
                 *
                 * Unlike [durationMs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_ms")
                @ExcludeMissing
                fun _durationMs(): JsonField<Double> = durationMs

                /**
                 * Returns the raw JSON value of [totalInputTokens].
                 *
                 * Unlike [totalInputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_input_tokens")
                @ExcludeMissing
                fun _totalInputTokens(): JsonField<Long> = totalInputTokens

                /**
                 * Returns the raw JSON value of [totalOutputTokens].
                 *
                 * Unlike [totalOutputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_output_tokens")
                @ExcludeMissing
                fun _totalOutputTokens(): JsonField<Long> = totalOutputTokens

                /**
                 * Returns the raw JSON value of [turns].
                 *
                 * Unlike [turns], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<Long> = turns

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

                    /** Returns a mutable builder for constructing an instance of [Usage]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Usage]. */
                class Builder internal constructor() {

                    private var durationMs: JsonField<Double> = JsonMissing.of()
                    private var totalInputTokens: JsonField<Long> = JsonMissing.of()
                    private var totalOutputTokens: JsonField<Long> = JsonMissing.of()
                    private var turns: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usage: Usage) = apply {
                        durationMs = usage.durationMs
                        totalInputTokens = usage.totalInputTokens
                        totalOutputTokens = usage.totalOutputTokens
                        turns = usage.turns
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun durationMs(durationMs: Double) = durationMs(JsonField.of(durationMs))

                    /**
                     * Sets [Builder.durationMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationMs] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun durationMs(durationMs: JsonField<Double>) = apply {
                        this.durationMs = durationMs
                    }

                    fun totalInputTokens(totalInputTokens: Long?) =
                        totalInputTokens(JsonField.ofNullable(totalInputTokens))

                    /**
                     * Alias for [Builder.totalInputTokens].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun totalInputTokens(totalInputTokens: Long) =
                        totalInputTokens(totalInputTokens as Long?)

                    /**
                     * Alias for calling [Builder.totalInputTokens] with
                     * `totalInputTokens.orElse(null)`.
                     */
                    fun totalInputTokens(totalInputTokens: Optional<Long>) =
                        totalInputTokens(totalInputTokens.getOrNull())

                    /**
                     * Sets [Builder.totalInputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalInputTokens] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun totalInputTokens(totalInputTokens: JsonField<Long>) = apply {
                        this.totalInputTokens = totalInputTokens
                    }

                    fun totalOutputTokens(totalOutputTokens: Long?) =
                        totalOutputTokens(JsonField.ofNullable(totalOutputTokens))

                    /**
                     * Alias for [Builder.totalOutputTokens].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun totalOutputTokens(totalOutputTokens: Long) =
                        totalOutputTokens(totalOutputTokens as Long?)

                    /**
                     * Alias for calling [Builder.totalOutputTokens] with
                     * `totalOutputTokens.orElse(null)`.
                     */
                    fun totalOutputTokens(totalOutputTokens: Optional<Long>) =
                        totalOutputTokens(totalOutputTokens.getOrNull())

                    /**
                     * Sets [Builder.totalOutputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalOutputTokens] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun totalOutputTokens(totalOutputTokens: JsonField<Long>) = apply {
                        this.totalOutputTokens = totalOutputTokens
                    }

                    fun turns(turns: Long) = turns(JsonField.of(turns))

                    /**
                     * Sets [Builder.turns] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.turns] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun turns(turns: JsonField<Long>) = apply { this.turns = turns }

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
                     * Returns an immutable instance of [Usage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Usage =
                        Usage(
                            durationMs,
                            totalInputTokens,
                            totalOutputTokens,
                            turns,
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
                 * @throws LlamaCloudInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Usage = apply {
                    if (validated) {
                        return@apply
                    }

                    durationMs()
                    totalInputTokens()
                    totalOutputTokens()
                    turns()
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
                    (if (durationMs.asKnown().isPresent) 1 else 0) +
                        (if (totalInputTokens.asKnown().isPresent) 1 else 0) +
                        (if (totalOutputTokens.asKnown().isPresent) 1 else 0) +
                        (if (turns.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Usage &&
                        durationMs == other.durationMs &&
                        totalInputTokens == other.totalInputTokens &&
                        totalOutputTokens == other.totalOutputTokens &&
                        turns == other.turns &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        durationMs,
                        totalInputTokens,
                        totalOutputTokens,
                        turns,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{durationMs=$durationMs, totalInputTokens=$totalInputTokens, totalOutputTokens=$totalOutputTokens, turns=$turns, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val STOP = of("stop")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    STOP
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    STOP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        STOP -> Value.STOP
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
                        STOP -> Known.STOP
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Stop &&
                    error == other.error &&
                    isError == other.isError &&
                    usage == other.usage &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(error, isError, usage, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Stop{error=$error, isError=$isError, usage=$usage, type=$type, additionalProperties=$additionalProperties}"
        }

        class UserInput
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(content, type, mutableMapOf())

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): String = content.getRequired("content")

            /**
             * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * Returns a mutable builder for constructing an instance of [UserInput].
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserInput]. */
            class Builder internal constructor() {

                private var content: JsonField<String>? = null
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userInput: UserInput) = apply {
                    content = userInput.content
                    type = userInput.type
                    additionalProperties = userInput.additionalProperties.toMutableMap()
                }

                fun content(content: String) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [UserInput].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .content()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UserInput =
                    UserInput(
                        checkRequired("content", content),
                        type,
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
            fun validate(): UserInput = apply {
                if (validated) {
                    return@apply
                }

                content()
                type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val USER_INPUT = of("user_input")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    USER_INPUT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USER_INPUT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        USER_INPUT -> Value.USER_INPUT
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
                        USER_INPUT -> Known.USER_INPUT
                        else -> throw LlamaCloudInvalidDataException("Unknown Type: $value")
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
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UserInput &&
                    content == other.content &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(content, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UserInput{content=$content, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Token usage and status from the most recent run. Null if the session has not been run yet.
     */
    class JobMetadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val durationMs: JsonField<Double>,
        private val error: JsonField<String>,
        private val exportConfigIds: JsonField<List<String>>,
        private val isError: JsonField<Boolean>,
        private val totalInputTokens: JsonField<Long>,
        private val totalOutputTokens: JsonField<Long>,
        private val turns: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duration_ms")
            @ExcludeMissing
            durationMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("export_config_ids")
            @ExcludeMissing
            exportConfigIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_error")
            @ExcludeMissing
            isError: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("total_input_tokens")
            @ExcludeMissing
            totalInputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_output_tokens")
            @ExcludeMissing
            totalOutputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("turns") @ExcludeMissing turns: JsonField<Long> = JsonMissing.of(),
        ) : this(
            durationMs,
            error,
            exportConfigIds,
            isError,
            totalInputTokens,
            totalOutputTokens,
            turns,
            mutableMapOf(),
        )

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun durationMs(): Optional<Double> = durationMs.getOptional("duration_ms")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exportConfigIds(): Optional<List<String>> =
            exportConfigIds.getOptional("export_config_ids")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isError(): Optional<Boolean> = isError.getOptional("is_error")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalInputTokens(): Optional<Long> = totalInputTokens.getOptional("total_input_tokens")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalOutputTokens(): Optional<Long> =
            totalOutputTokens.getOptional("total_output_tokens")

        /**
         * @throws LlamaCloudInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun turns(): Optional<Long> = turns.getOptional("turns")

        /**
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration_ms")
        @ExcludeMissing
        fun _durationMs(): JsonField<Double> = durationMs

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [exportConfigIds].
         *
         * Unlike [exportConfigIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("export_config_ids")
        @ExcludeMissing
        fun _exportConfigIds(): JsonField<List<String>> = exportConfigIds

        /**
         * Returns the raw JSON value of [isError].
         *
         * Unlike [isError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_error") @ExcludeMissing fun _isError(): JsonField<Boolean> = isError

        /**
         * Returns the raw JSON value of [totalInputTokens].
         *
         * Unlike [totalInputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_input_tokens")
        @ExcludeMissing
        fun _totalInputTokens(): JsonField<Long> = totalInputTokens

        /**
         * Returns the raw JSON value of [totalOutputTokens].
         *
         * Unlike [totalOutputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("total_output_tokens")
        @ExcludeMissing
        fun _totalOutputTokens(): JsonField<Long> = totalOutputTokens

        /**
         * Returns the raw JSON value of [turns].
         *
         * Unlike [turns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<Long> = turns

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

            /** Returns a mutable builder for constructing an instance of [JobMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [JobMetadata]. */
        class Builder internal constructor() {

            private var durationMs: JsonField<Double> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var exportConfigIds: JsonField<MutableList<String>>? = null
            private var isError: JsonField<Boolean> = JsonMissing.of()
            private var totalInputTokens: JsonField<Long> = JsonMissing.of()
            private var totalOutputTokens: JsonField<Long> = JsonMissing.of()
            private var turns: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(jobMetadata: JobMetadata) = apply {
                durationMs = jobMetadata.durationMs
                error = jobMetadata.error
                exportConfigIds = jobMetadata.exportConfigIds.map { it.toMutableList() }
                isError = jobMetadata.isError
                totalInputTokens = jobMetadata.totalInputTokens
                totalOutputTokens = jobMetadata.totalOutputTokens
                turns = jobMetadata.turns
                additionalProperties = jobMetadata.additionalProperties.toMutableMap()
            }

            fun durationMs(durationMs: Double) = durationMs(JsonField.of(durationMs))

            /**
             * Sets [Builder.durationMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMs(durationMs: JsonField<Double>) = apply { this.durationMs = durationMs }

            fun error(error: String?) = error(JsonField.ofNullable(error))

            /** Alias for calling [Builder.error] with `error.orElse(null)`. */
            fun error(error: Optional<String>) = error(error.getOrNull())

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            fun exportConfigIds(exportConfigIds: List<String>?) =
                exportConfigIds(JsonField.ofNullable(exportConfigIds))

            /** Alias for calling [Builder.exportConfigIds] with `exportConfigIds.orElse(null)`. */
            fun exportConfigIds(exportConfigIds: Optional<List<String>>) =
                exportConfigIds(exportConfigIds.getOrNull())

            /**
             * Sets [Builder.exportConfigIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exportConfigIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exportConfigIds(exportConfigIds: JsonField<List<String>>) = apply {
                this.exportConfigIds = exportConfigIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exportConfigIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExportConfigId(exportConfigId: String) = apply {
                exportConfigIds =
                    (exportConfigIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exportConfigIds", it).add(exportConfigId)
                    }
            }

            fun isError(isError: Boolean) = isError(JsonField.of(isError))

            /**
             * Sets [Builder.isError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isError] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isError(isError: JsonField<Boolean>) = apply { this.isError = isError }

            fun totalInputTokens(totalInputTokens: Long?) =
                totalInputTokens(JsonField.ofNullable(totalInputTokens))

            /**
             * Alias for [Builder.totalInputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalInputTokens(totalInputTokens: Long) =
                totalInputTokens(totalInputTokens as Long?)

            /**
             * Alias for calling [Builder.totalInputTokens] with `totalInputTokens.orElse(null)`.
             */
            fun totalInputTokens(totalInputTokens: Optional<Long>) =
                totalInputTokens(totalInputTokens.getOrNull())

            /**
             * Sets [Builder.totalInputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalInputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalInputTokens(totalInputTokens: JsonField<Long>) = apply {
                this.totalInputTokens = totalInputTokens
            }

            fun totalOutputTokens(totalOutputTokens: Long?) =
                totalOutputTokens(JsonField.ofNullable(totalOutputTokens))

            /**
             * Alias for [Builder.totalOutputTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalOutputTokens(totalOutputTokens: Long) =
                totalOutputTokens(totalOutputTokens as Long?)

            /**
             * Alias for calling [Builder.totalOutputTokens] with `totalOutputTokens.orElse(null)`.
             */
            fun totalOutputTokens(totalOutputTokens: Optional<Long>) =
                totalOutputTokens(totalOutputTokens.getOrNull())

            /**
             * Sets [Builder.totalOutputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalOutputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalOutputTokens(totalOutputTokens: JsonField<Long>) = apply {
                this.totalOutputTokens = totalOutputTokens
            }

            fun turns(turns: Long) = turns(JsonField.of(turns))

            /**
             * Sets [Builder.turns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turns] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun turns(turns: JsonField<Long>) = apply { this.turns = turns }

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
             * Returns an immutable instance of [JobMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): JobMetadata =
                JobMetadata(
                    durationMs,
                    error,
                    (exportConfigIds ?: JsonMissing.of()).map { it.toImmutable() },
                    isError,
                    totalInputTokens,
                    totalOutputTokens,
                    turns,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): JobMetadata = apply {
            if (validated) {
                return@apply
            }

            durationMs()
            error()
            exportConfigIds()
            isError()
            totalInputTokens()
            totalOutputTokens()
            turns()
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
            (if (durationMs.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (exportConfigIds.asKnown().getOrNull()?.size ?: 0) +
                (if (isError.asKnown().isPresent) 1 else 0) +
                (if (totalInputTokens.asKnown().isPresent) 1 else 0) +
                (if (totalOutputTokens.asKnown().isPresent) 1 else 0) +
                (if (turns.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is JobMetadata &&
                durationMs == other.durationMs &&
                error == other.error &&
                exportConfigIds == other.exportConfigIds &&
                isError == other.isError &&
                totalInputTokens == other.totalInputTokens &&
                totalOutputTokens == other.totalOutputTokens &&
                turns == other.turns &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                durationMs,
                error,
                exportConfigIds,
                isError,
                totalInputTokens,
                totalOutputTokens,
                turns,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JobMetadata{durationMs=$durationMs, error=$error, exportConfigIds=$exportConfigIds, isError=$isError, totalInputTokens=$totalInputTokens, totalOutputTokens=$totalOutputTokens, turns=$turns, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChatRetrieveResponse &&
            events == other.events &&
            lastUpdatedAt == other.lastUpdatedAt &&
            sessionId == other.sessionId &&
            generatedTitle == other.generatedTitle &&
            indexIds == other.indexIds &&
            jobMetadata == other.jobMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            events,
            lastUpdatedAt,
            sessionId,
            generatedTitle,
            indexIds,
            jobMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatRetrieveResponse{events=$events, lastUpdatedAt=$lastUpdatedAt, sessionId=$sessionId, generatedTitle=$generatedTitle, indexIds=$indexIds, jobMetadata=$jobMetadata, additionalProperties=$additionalProperties}"
}
