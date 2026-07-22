# Changelog

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
