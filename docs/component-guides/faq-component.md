# FAQ Component

## Overview
Searchable question-and-answer collection for support and product content.

## Features
- Question and answer multifield
- Optional client-side search
- Native disclosure interaction
- HTML answers

## Dialog Fields
Enable Search, Question, and Answer.

## Author Guide
Enable search for longer lists and write questions as complete, searchable phrases.

## Screenshots
Add author and published screenshots to `docs/screenshots/faq/`.

## Technical Design
`FaqModel` exposes child items and the `searchEnabled` flag; `aemcomponentlibrary.faq` owns filtering behavior.