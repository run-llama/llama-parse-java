# Changelog

## [1.11.0](https://github.com/run-llama/llama-parse-java/compare/v1.10.0...v1.11.0) (2026-11-20)


### Features

* **extract:** expose Max effort in the public API ([#30756](https://github.com/run-llama/llama-parse-java/issues/30756)) ([5ec457a](https://github.com/run-llama/llama-parse-java/commit/5ec457a76d97b36f4aa9dee2d419884cfbf82980))
* **extract:** send a saved configuration's completed jobs to review by policy ([#34124](https://github.com/run-llama/llama-parse-java/issues/34124)) ([842d68d](https://github.com/run-llama/llama-parse-java/commit/842d68d7618260149abff6abd770a2e294c2ef6c))
* **parse-eval:** keep ground truth in Evaluate-owned storage ([#33781](https://github.com/run-llama/llama-parse-java/issues/33781)) ([fa22954](https://github.com/run-llama/llama-parse-java/commit/fa229549551b2d9c0295feb302ab4a392c7e6266))
* **parse-eval:** let Parse delete ground-truth jobs like any other job ([#35004](https://github.com/run-llama/llama-parse-java/issues/35004)) ([68d90ce](https://github.com/run-llama/llama-parse-java/commit/68d90ceb7be51219456cfd382453f2f739791c84))
* **parse:** add document page count bounds ([#34227](https://github.com/run-llama/llama-parse-java/issues/34227)) ([6243d06](https://github.com/run-llama/llama-parse-java/commit/6243d06d81722da7923e9998adf348ef9f5fba11))
* **parse:** Agentic and Cost Effective 2026-11-09 lead with OCRIA 1.5 ([#33718](https://github.com/run-llama/llama-parse-java/issues/33718)) ([1be01d1](https://github.com/run-llama/llama-parse-java/commit/1be01d1db5bc4a41decb89aeb00033d9c7782d79))
* **parse:** optional `bbox` on form text grounding in the public API schema ([#35073](https://github.com/run-llama/llama-parse-java/issues/35073)) ([0f2420e](https://github.com/run-llama/llama-parse-java/commit/0f2420eb86407d239a6433170a1b622002448e29))
* **split:** advisory warnings for ambiguous category configs ([#34714](https://github.com/run-llama/llama-parse-java/issues/34714)) ([2e8f20e](https://github.com/run-llama/llama-parse-java/commit/2e8f20e04334c8e81b3e1a74c907e1d577170db5))
* **split:** category segment boundary in 1.3.0 ([#35081](https://github.com/run-llama/llama-parse-java/issues/35081)) ([4f57bfb](https://github.com/run-llama/llama-parse-java/commit/4f57bfbefbd171338fa33eb98694c5976dd4d6e6))
* **webhooks:** keep a saved webhook's masked credentials by its id ([#32736](https://github.com/run-llama/llama-parse-java/issues/32736)) ([f04a1f0](https://github.com/run-llama/llama-parse-java/commit/f04a1f09cbaebcbc739b0d3b693284d93dbfc63a))


### Bug Fixes

* **api:** reject a page_size below 1 on every list route's pagination query (PROD-10603) ([#30406](https://github.com/run-llama/llama-parse-java/issues/30406)) ([dd26597](https://github.com/run-llama/llama-parse-java/commit/dd265978008a7236f0e562d778b8467507d693d3))
* keep legacy pipelines with empty embedding configs listable ([#31282](https://github.com/run-llama/llama-parse-java/issues/31282)) ([61b8470](https://github.com/run-llama/llama-parse-java/commit/61b8470a809145e93ef8572120a81e59a4705d49))
* **split:** reject category names that make segment labels ambiguous (PROD-10501) ([#29963](https://github.com/run-llama/llama-parse-java/issues/29963)) ([2761fa3](https://github.com/run-llama/llama-parse-java/commit/2761fa31670a080790554e0ab5d89101c3c13197))


### Chores

* **stlc:** seal custom-code tracking files ([8e38ade](https://github.com/run-llama/llama-parse-java/commit/8e38adeb9f8f16f23aaacfc0de59d764d40ee8c4))


### Documentation

* **extract:** describe Max effort pricing by the processing each document needs ([#33403](https://github.com/run-llama/llama-parse-java/issues/33403)) ([dd360d5](https://github.com/run-llama/llama-parse-java/commit/dd360d574d4c6086fef24122605dc27a63b62d3e))
* **split:** PPTX segment pages count visible slides only (PROD-10504) ([#29972](https://github.com/run-llama/llama-parse-java/issues/29972)) ([7048062](https://github.com/run-llama/llama-parse-java/commit/7048062de20d44d497d9b38d27b5bcdf75b2723b))

## [1.10.0](https://github.com/run-llama/llama-parse-java/compare/v1.9.0...v1.10.0) (2026-10-21)


### Features

* **classify:** add expand=usage to GET /api/v2/classify/{job_id} ([#29577](https://github.com/run-llama/llama-parse-java/issues/29577)) ([031311b](https://github.com/run-llama/llama-parse-java/commit/031311b933c26b733dadc0181a485d16aea9fe5b))


### Bug Fixes

* **parse:** apply watermark and wrapped-word rules to Lite fallbacks ([#30128](https://github.com/run-llama/llama-parse-java/issues/30128)) ([972d540](https://github.com/run-llama/llama-parse-java/commit/972d540aaca9f36afc8476eb367320a0555a528a))
* **sdk:** one FormText model for the forms text node (PROD-10339) ([80cc983](https://github.com/run-llama/llama-parse-java/commit/80cc983e4f04e88f0c7060cd0196df5fd0ceb738))
* **split:** refuse to delete a non-terminal job ([#29785](https://github.com/run-llama/llama-parse-java/issues/29785)) ([e71421a](https://github.com/run-llama/llama-parse-java/commit/e71421a3e146595fa30435939b5b63980bba3fcf))


### Chores

* **stlc:** seal custom-code tracking files ([01805c5](https://github.com/run-llama/llama-parse-java/commit/01805c52f7b5ddf09095d93e1e3813acc66998c9))

## [1.9.0](https://github.com/run-llama/llama-parse-java/compare/v1.8.0...v1.9.0) (2026-10-09)


### Features

* **sdk:** move Index v2 indexes, retrieval and chat out of beta (PROD-10331) ([bd278de](https://github.com/run-llama/llama-parse-java/commit/bd278de76bbf4bce34f5ba309fd2f139fee068f7))
* **sdk:** publish Verify as client.alpha.verify (PROD-10334) ([3b3dbb4](https://github.com/run-llama/llama-parse-java/commit/3b3dbb42ce71b19dbc34a8793d432b63ade7f09e))


### Chores

* **stlc:** seal custom-code tracking files ([0f0a23d](https://github.com/run-llama/llama-parse-java/commit/0f0a23d142584b4a1806e0adc37233f15e111f33))

## [1.8.0](https://github.com/run-llama/llama-parse-java/compare/v1.7.0...v1.8.0) (2026-10-07)


### Features

* add redline prompt changes to new prod version ([#27635](https://github.com/run-llama/llama-parse-java/issues/27635)) ([3cfe72e](https://github.com/run-llama/llama-parse-java/commit/3cfe72e8e1ee5864ab7939bf0b1012a881039b98))
* **chat:** let a chat session refuse queries from its share link ([#27012](https://github.com/run-llama/llama-parse-java/issues/27012)) ([d416708](https://github.com/run-llama/llama-parse-java/commit/d416708fd07dfb62fb4468949c1cbc4cbe98b9a7))
* **parse:** add option to include hidden PPTX slides ([#27938](https://github.com/run-llama/llama-parse-java/issues/27938)) ([c9a5629](https://github.com/run-llama/llama-parse-java/commit/c9a5629387e1f9b7c67871df0734905b3c303e31))
* **parse:** agentic 2026-09-09 — cache-stable prompt order + Flash Lite MINIMAL thinking ([#26273](https://github.com/run-llama/llama-parse-java/issues/26273)) ([9c31adf](https://github.com/run-llama/llama-parse-java/commit/9c31adf96fa3099763c2396be3766b30beff1fef))
* **parse:** apply watermark_handling to text output; add watermark e2e test ([#27932](https://github.com/run-llama/llama-parse-java/issues/27932)) ([4c89f1e](https://github.com/run-llama/llama-parse-java/commit/4c89f1ef618fb6b1dc505734dd7e13ecccdcd902))
* **parse:** display enriched Forms granular highlights ([#26366](https://github.com/run-llama/llama-parse-java/issues/26366)) ([3d10c5d](https://github.com/run-llama/llama-parse-java/commit/3d10c5d609118526672920b51ff06faa3dd930d8))
* **parse:** remove_watermark output option with 2026-09-28 tier versions ([#27813](https://github.com/run-llama/llama-parse-java/issues/27813)) ([446099a](https://github.com/run-llama/llama-parse-java/commit/446099a07ade838a27d2a072dddb4faaaea076a0))
* **sdk:** publish beta.attachments list and get ([5fa78c1](https://github.com/run-llama/llama-parse-java/commit/5fa78c17b3ad07988ad2c5ccc84ae98935dd45b5))
* **split:** target_pages page selection when splitting a parse job ([#26921](https://github.com/run-llama/llama-parse-java/issues/26921)) ([7c99d43](https://github.com/run-llama/llama-parse-java/commit/7c99d436ac48d8f1af1b5d97cf0333ab3ebe0dae))


### Bug Fixes

* **chat:** report every index a chat turn could not query ([#26981](https://github.com/run-llama/llama-parse-java/issues/26981)) ([f93b05c](https://github.com/run-llama/llama-parse-java/commit/f93b05c08fb009fa0401881793a3b0a24880ea57))
* **extract:** refuse to delete a non-terminal job (LI-8700) ([#23793](https://github.com/run-llama/llama-parse-java/issues/23793)) ([d8e589a](https://github.com/run-llama/llama-parse-java/commit/d8e589ad5811643242072bcc0e0a789394aa0652))
* **split:** process target_pages in the order written, matching Extract ([#28173](https://github.com/run-llama/llama-parse-java/issues/28173)) ([feaa04c](https://github.com/run-llama/llama-parse-java/commit/feaa04ca31948ebd8805fde802cec8c4e0fd3255))
* **split:** process target_pages in the order written, matching Extract ([#28173](https://github.com/run-llama/llama-parse-java/issues/28173)) ([eab05d9](https://github.com/run-llama/llama-parse-java/commit/eab05d97c9497d2354ece756ed9946c3ed4806ed))


### Chores

* **stlc:** restore generated sources stripped by a poisoned custom-code seal ([fe520ab](https://github.com/run-llama/llama-parse-java/commit/fe520abd8f6aa34395283da13e00d4033cd3c014))
* **stlc:** restore generated sources stripped by a poisoned custom-code seal ([5418b1f](https://github.com/run-llama/llama-parse-java/commit/5418b1f66d3699e312f38718845cc36c90c3a258))
* **sync:** resolve back-sync conflicts with production ([f22b437](https://github.com/run-llama/llama-parse-java/commit/f22b437a86110000dd1c1221017dfcc2f71b0e1e))


### Documentation

* **changelog:** cite the real generated commit, not the empty one ([9c05e8a](https://github.com/run-llama/llama-parse-java/commit/9c05e8a901f8621021c5919ff8e00606aa504420))
* **changelog:** correct the 1.7.0 entries ([2cbcdcc](https://github.com/run-llama/llama-parse-java/commit/2cbcdcc789b302a9d16ea759cc3a8b51440706dc))
* **changelog:** correct the shipped 1.7.0 changelog entries ([70d74ec](https://github.com/run-llama/llama-parse-java/commit/70d74ecfc65c1bc714cacd7b24d3e2e3ef997750))
* update Extract versions and pricing ([#28128](https://github.com/run-llama/llama-parse-java/issues/28128)) ([975a504](https://github.com/run-llama/llama-parse-java/commit/975a504436a9156808934b79eec7a7ba444284cb))

## [1.6.0](https://github.com/run-llama/llama-parse-java/compare/v1.5.1...v1.6.0) (2026-08-28)


### Features

* **extract:** publish the turbo tier on the public API surface (LI-8873) ([#25281](https://github.com/run-llama/llama-parse-java/issues/25281)) ([8161d3a](https://github.com/run-llama/llama-parse-java/commit/8161d3a802a5548c5e30915e560d27b74c06ea7f))

## [1.5.1](https://github.com/run-llama/llama-parse-java/compare/v1.5.0...v1.5.1) (2026-08-20)


### Features

* **parse:** expose legal-document preset in v2 ([#24192](https://github.com/run-llama/llama-parse-java/issues/24192)) ([30270a2](https://github.com/run-llama/llama-parse-java/commit/30270a2be8583c150386062ff0cb456c9d038c30))


### Bug Fixes

* **parse:** restore inline_images on cost_effective (new version 2026-08-11) ([#23804](https://github.com/run-llama/llama-parse-java/issues/23804)) ([a5aad68](https://github.com/run-llama/llama-parse-java/commit/a5aad68a345b18eb57a018ad774e9d518f6204c5))
* route security reports to support@runllama.ai; name LlamaIndex, Inc. in LICENSE ([#10](https://github.com/run-llama/llama-parse-java/issues/10)) ([3ae8ad0](https://github.com/run-llama/llama-parse-java/commit/3ae8ad0d0a8c662a42d52c3c8bc6c6beaa2a34ff))


### Reverts

* expose legal-document preset in v2 ([39589e9](https://github.com/run-llama/llama-parse-java/commit/39589e9628a8b3645e8f485f87be57fb90156559))


### Documentation

* fix non-compiling README examples (LI-8881) ([c6201ed](https://github.com/run-llama/llama-parse-java/commit/c6201ed691dbe3133b4781c37fcafe3eb4628711))

## [1.4.0](https://github.com/run-llama/llama-parse-java/compare/v1.3.0...v1.4.0) (2026-07-22)


### Features

* **extract:** report num_pages_billed on extract job usage ([#22323](https://github.com/run-llama/llama-parse-java/issues/22323)) ([6fbfa52](https://github.com/run-llama/llama-parse-java/commit/6fbfa5227c4494394f9424df9168db56178a116f))
* **sheets:** cost_effective/agentic tiers and per-region billing ([#22508](https://github.com/run-llama/llama-parse-java/issues/22508)) ([9c1ac4d](https://github.com/run-llama/llama-parse-java/commit/9c1ac4d87026d7d10ab822e80a48f0a52de14387))

## [1.3.0](https://github.com/run-llama/llama-parse-java/compare/v1.2.0...v1.3.0) (2026-07-21)


### Features

* **brokered-connection:** wire data-source create/read to brokered_connection_id ([#21699](https://github.com/run-llama/llama-parse-java/issues/21699)) ([9791a7d](https://github.com/run-llama/llama-parse-java/commit/9791a7d685d9f7d7eec1ac147edc3f28c4544ccf))
* **gdrive:** reuse-first connection picker in the data-source connect modal ([#21725](https://github.com/run-llama/llama-parse-java/issues/21725)) ([b30a5cd](https://github.com/run-llama/llama-parse-java/commit/b30a5cd32f4a056e9d4f1cf8045ff77beb52f57e))
* **llamaparse:** agentic 2026-07-15 — Markdown-pipe table body for Gemini 3.1 Flash-Lite (EU primary) ([#22208](https://github.com/run-llama/llama-parse-java/issues/22208)) ([a855cf6](https://github.com/run-llama/llama-parse-java/commit/a855cf66616f6b69ff441a53cec55577053b5d3c))
* **parse:** adding forms pass to api layer (forms=`enrich` param + output types) ([#22012](https://github.com/run-llama/llama-parse-java/issues/22012)) ([5115dfc](https://github.com/run-llama/llama-parse-java/commit/5115dfcc3319e878b625f4d39a9d540120f931d2))
* **parse:** confidence_scores="verified" — per-page AI-verified confidence + document-level score ([#22083](https://github.com/run-llama/llama-parse-java/issues/22083)) ([431cbaa](https://github.com/run-llama/llama-parse-java/commit/431cbaa5773b82312c7a693e7e6161ac71f05eee))
* **parse:** rename confidence scoring option + billing event (confidence_score_effort / confidence_score_high) ([#22290](https://github.com/run-llama/llama-parse-java/issues/22290)) ([9797c07](https://github.com/run-llama/llama-parse-java/commit/9797c07c7933b1b7eabda8d3f6ca12dc98bc3fab))
* **sdk:** drop the `prod` project suffix from Go and Java namespaces ([e7c3865](https://github.com/run-llama/llama-parse-java/commit/e7c3865b50257fc1b8600e03fdb9bcb6dcd970b4))


### Bug Fixes

* **parse:** declare the recursive form node schemas as models ([f2fc3f6](https://github.com/run-llama/llama-parse-java/commit/f2fc3f6f91184d953ea7f6bcb09bb7f5ca38baa3))


### Chores

* sync release metadata from production (v1.2.0) ([01cb952](https://github.com/run-llama/llama-parse-java/commit/01cb95204096dcadbea219beb64e02f05d320f4f))

## [1.2.0](https://github.com/run-llama/llama-parse-java/compare/v1.1.0...v1.2.0) (2026-07-09)


### Features

* **agentic-plus:** dated version 2026-07-08 — graduate decomposed-gemini (flash-lite), fallback to 2026-06-18 ([#21738](https://github.com/run-llama/llama-parse-java/issues/21738)) ([68fbd72](https://github.com/run-llama/llama-parse-java/commit/68fbd72c6e99cfc9a4a615ce92aab33fd948fff1))
* update fast tier latest version to use liteparse + markdown ([#21669](https://github.com/run-llama/llama-parse-java/issues/21669)) ([3fb0305](https://github.com/run-llama/llama-parse-java/commit/3fb03059def285ca14291d9d597435180f87a8e8))

## [1.1.0](https://github.com/run-llama/llama-parse-java/compare/v1.0.0...v1.1.0) (2026-06-30)


### Features

* **index:** add output_directory_id to IndexResponse ([#21149](https://github.com/run-llama/llama-parse-java/issues/21149)) ([28b65a9](https://github.com/run-llama/llama-parse-java/commit/28b65a9a8a2f178af9c8c44437a3c0d28900045c))


### Bug Fixes

* **ci:** keep staging workflows on back-sync so GITHUB_TOKEN can push ([7724870](https://github.com/run-llama/llama-parse-java/commit/7724870051f66a724271a211841d63ddadd8355e))
* **ci:** merge back-sync PR immediately instead of --auto ([23ba9bb](https://github.com/run-llama/llama-parse-java/commit/23ba9bbb7f52dd0c800015cb58a41139fc43bc23))
* **ci:** squash-MERGE production into staging, don't reset to it ([86c43a0](https://github.com/run-llama/llama-parse-java/commit/86c43a00d3739e6695ec6bef5c4343cefb086f36))
* **java:** publish via Sonatype Central Portal (sonatype_platform: portal) ([ab163b0](https://github.com/run-llama/llama-parse-java/commit/ab163b0677f42813b93cf3a96dc9315134d75b4b))


### Documentation

* fix stale javadoc URL version 0.0.1 -&gt; 1.0.0 ([76a9438](https://github.com/run-llama/llama-parse-java/commit/76a9438072df929b58128486998061824834ee38))

## [1.0.0](https://github.com/run-llama/llama-parse-java/compare/v0.0.1...v1.0.0) (2026-06-25)


### Features

* **java:** enable Maven Central publishing (ai.llamaindex:llama-cloud) ([6bc70c0](https://github.com/run-llama/llama-parse-java/commit/6bc70c07baea09fe7a3332eacd46606b9e97c722))


### Chores

* configure new SDK language ([f5bfbf1](https://github.com/run-llama/llama-parse-java/commit/f5bfbf17777ed432162656ae5e3eaeb7d40978cb))
* release 1.0.0 ([845b61c](https://github.com/run-llama/llama-parse-java/commit/845b61ccc16299996e92b8e52b78e647ba460f35))
* **spec:** sync OpenAPI spec from platform ([1245d24](https://github.com/run-llama/llama-parse-java/commit/1245d24ba984b175a8fb2c8886a7dd4012816f0d))
