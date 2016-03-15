package com.github.karamelsoft.testing.data.driven.testing.core.builders;

/**
 * Created by frederic on 26/04/15.
 */
public interface FolderBuilder<O> extends Trigger<O> {

    /**
     *
     * @param resourceFolderPath
     * @return
     */
    FolderBuilder<O> resourcePath(String resourceFolderPath);

    /**
     *
     * @param targetFolder
     * @return
     */
    FolderBuilder<O> targetPath(String targetFolder);
}
