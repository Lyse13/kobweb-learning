package com.lysette.san.styles

import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.filter
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@OptIn(ExperimentalComposeWebApi::class)
val AboutImageStyle = CssStyle {
    base {
        Modifier
            .styleModifier { filter { grayscale(100.percent) } }
            .borderRadius(0.px)
            .rotate(0.deg)
            .transition {
                property(TransitionProperty.All)
                duration(200.ms)
            }
    }
    hover {
        Modifier
            .styleModifier { filter { grayscale(0.percent) } }
            .borderRadius(100.px)
            .rotate(10.deg)
    }
}

val AboutTextStyle = CssStyle {
    base {
        Modifier
            .opacity(50.percent)
            .transition{
                property  ("opacity")
                duration ( 200.ms)
            }
    }
    hover {
        Modifier.opacity(100.percent)
    }
}