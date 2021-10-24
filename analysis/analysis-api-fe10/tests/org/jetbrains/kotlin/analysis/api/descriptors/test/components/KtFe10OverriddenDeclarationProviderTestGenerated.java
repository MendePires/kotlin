/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.descriptors.test.components;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/overriddenDeclarations")
@TestDataPath("$PROJECT_ROOT")
public class KtFe10OverriddenDeclarationProviderTestGenerated extends AbstractKtFe10OverriddenDeclarationProviderTest {
    @Test
    public void testAllFilesPresentInOverriddenDeclarations() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/overriddenDeclarations"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("backingField.kt")
    public void testBackingField() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/backingField.kt");
    }

    @Test
    @TestMetadata("inAnonymousClass.kt")
    public void testInAnonymousClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/inAnonymousClass.kt");
    }

    @Test
    @TestMetadata("inLocalClass.kt")
    public void testInLocalClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/inLocalClass.kt");
    }

    @Test
    @TestMetadata("inOtherFile.kt")
    public void testInOtherFile() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/inOtherFile.kt");
    }

    @Test
    @TestMetadata("intersectionOverride.kt")
    public void testIntersectionOverride() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/intersectionOverride.kt");
    }

    @Test
    @TestMetadata("intersectionOverride2.kt")
    public void testIntersectionOverride2() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/intersectionOverride2.kt");
    }

    @Test
    @TestMetadata("javaAccessors.kt")
    public void testJavaAccessors() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/javaAccessors.kt");
    }

    @Test
    @TestMetadata("multipleInterfaces.kt")
    public void testMultipleInterfaces() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/multipleInterfaces.kt");
    }

    @Test
    @TestMetadata("onEnumEntry.kt")
    public void testOnEnumEntry() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/onEnumEntry.kt");
    }

    @Test
    @TestMetadata("sequenceOfOverrides.kt")
    public void testSequenceOfOverrides() throws Exception {
        runTest("analysis/analysis-api/testData/components/overriddenDeclarations/sequenceOfOverrides.kt");
    }
}
