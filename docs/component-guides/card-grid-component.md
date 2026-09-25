# Card Grid Component

## Overview
Responsive card collection for image-led content and calls to action.

## Features
- DAM image support with lazy loading
- Two, three, and four-column variants
- Card multifield with title, description, and CTA
- Mobile single-column fallback

## Dialog Fields
Grid Variant, Image, Title, Description, CTA Text, and CTA Link.

## Author Guide
Use consistent image aspect ratios and choose the grid variant that matches the number of cards.

## Screenshots
Add author and published screenshots to `docs/screenshots/card-grid/`.

## Technical Design
`CardGridModel` maps `@ChildResource(name = "cards")` and resolves a validated grid class for the scoped clientlib.