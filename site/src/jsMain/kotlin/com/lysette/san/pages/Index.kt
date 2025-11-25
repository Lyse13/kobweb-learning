package com.lysette.san.pages

import androidx.compose.runtime.Composable
import com.lysette.san.sections.AboutSection
import com.lysette.san.sections.AchievementsSection
import com.lysette.san.sections.ExperienceSection
import com.lysette.san.sections.MainSection
import com.lysette.san.sections.PortfolioSection
import com.lysette.san.sections.ServiceSection
import com.lysette.san.sections.TestimonialSection
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun HomePage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainSection()
        AboutSection()
        ServiceSection()
        PortfolioSection()
        AchievementsSection()
        TestimonialSection()
        ExperienceSection()
    }
}
