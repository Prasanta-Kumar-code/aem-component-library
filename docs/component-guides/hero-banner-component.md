# Hero Banner Component

## Overview
Full-width editorial banner for a title, description, background DAM image, and primary call to action.

## Features
- Responsive background image
- Left, center, and right alignment
- Edit-mode placeholder
- Scoped clientlib category `aemcomponentlibrary.hero-banner`

## Dialog Fields
Title, Description, Background Image, CTA Text, CTA Link, and Alignment.

## Author Guide
Select a landscape DAM image, keep the title concise, and verify text contrast against the selected asset.

## Screenshots
Add author and published screenshots to `docs/screenshots/hero-banner/`.

## Technical Design
`HeroBannerModel` exposes authored values; `hero-banner.html` renders HTL and the component clientlib owns presentation.