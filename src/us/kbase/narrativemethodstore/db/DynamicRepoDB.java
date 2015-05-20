package us.kbase.narrativemethodstore.db;

import java.util.List;

import us.kbase.narrativemethodstore.exceptions.NarrativeMethodStoreException;

public interface DynamicRepoDB {
    public void registerRepo(String repoUrl, RepoProvider repoDetails) throws NarrativeMethodStoreException;
    public List<String> listRepoModuleNames() throws NarrativeMethodStoreException;
    public RepoProvider getRepoDetails(String repoModuleName) throws NarrativeMethodStoreException;
}
