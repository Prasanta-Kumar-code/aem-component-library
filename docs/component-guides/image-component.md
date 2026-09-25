# Image Component

## Overview
Core Image Component v3 extension for DAM-managed responsive imagery.

## Features
- DAM asset picker
- Alternative text and decorative-image support
- Responsive rendition selection and lazy loading from Core Components

## Dialog Fields
The inherited Core Image dialog provides asset, alt text, link, crop, and caption fields.

## Author Guide
Choose an asset from `/content/dam`, review the generated alternative text, and use the image policy to control responsive widths.

## Screenshots
Add author and published screenshots to `docs/screenshots/image/`.

## Technical Design
Resource super type: `core/wcm/components/image/v3/image`; no duplicate image delivery logic is maintained in this project.