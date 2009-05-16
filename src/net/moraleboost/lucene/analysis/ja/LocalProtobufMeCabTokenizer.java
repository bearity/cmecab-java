package net.moraleboost.lucene.analysis.ja;

import java.io.IOException;
import java.io.Reader;

import net.moraleboost.mecab.MeCabException;
import net.moraleboost.mecab.Tagger;
import net.moraleboost.mecab.impl.LocalProtobufTagger;

public class LocalProtobufMeCabTokenizer extends MeCabTokenizer
{
    /**
     * MeCabを用いて入力を分かち書きするTokenizerを構築する。
     * 
     * @param in
     *            入力
     * @param arg
     *            MeCabに与えるオプション
     * @throws IOException
     */
    public LocalProtobufMeCabTokenizer(Reader in, String arg)
    throws MeCabException, IOException
    {
        this(in, arg, DEFAULT_MAX_SIZE);
    }

    /**
     * MeCabを用いて入力を分かち書きするTokenizerを構築する。
     * 
     * @param in
     *            入力
     * @param arg
     *            MeCabに与えるオプション
     * @param maxSize
     *            入力から読み込んだデータの量がこの値を超えると、
     *            解析は失敗し、MeCabExceptionが発生する。
     * @throws IOException
     * @throws MeCabException
     */
    public LocalProtobufMeCabTokenizer(Reader in, String arg, int maxSize)
    throws MeCabException, IOException
    {
        this(in, new LocalProtobufTagger(arg), true, maxSize);
    }

    public LocalProtobufMeCabTokenizer(Reader in, Tagger tagger, boolean ownTagger, int maxSize)
            throws MeCabException, IOException
    {
        super(in, tagger, ownTagger, maxSize);
    }
}
