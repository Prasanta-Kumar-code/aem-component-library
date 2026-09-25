# Accordion Component

## Overview
Accessible native-details accordion backed by authored question and answer items.

## Features
- Multifield items
- Expand and collapse without a framework dependency
- HTML answer content
- Edit-mode placeholder

## Dialog Fields
Accordion Items: Item Title and Item Content.

## Author Guide
Add one item per question, keep titles descriptive, and use the content field for the answer.

## Screenshots
Add author and published screenshots to `docs/screenshots/accordion/`.

## Technical Design
`AccordionModel` injects `@ChildResource(name = "items")`; `aemcomponentlibrary.accordion` supplies CSS.