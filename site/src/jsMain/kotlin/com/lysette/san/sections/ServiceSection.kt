package com.lysette.san.sections

import androidx.compose.runtime.Composable
import com.lysette.san.components.SectionTitle
import com.lysette.san.components.ServiceCard
import com.lysette.san.models.Section
import com.lysette.san.models.Service
import com.lysette.san.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceSection() {
    Box(
        modifier = Modifier
            .id(Section.Service.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        ServiceContent()
    }
}

@OptIn(DelicateApi::class)
@Composable
fun ServiceContent() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 20.px),
            section = Section.Service,
            alignment = Alignment.CenterHorizontally
        )
        SimpleGrid(numColumns = numColumns(base = 1, sm = 2, md = 3)) {
            Service.entries.forEach { service ->
                ServiceCard(service = service)
            }
        }
    }
}