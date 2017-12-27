
package com.knowledge.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.knowledge.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddFile_QNAME = new QName("http://ws.knowledge.com/", "addFile");
    private final static QName _AddFileResponse_QNAME = new QName("http://ws.knowledge.com/", "addFileResponse");
    private final static QName _AddNewRecord_QNAME = new QName("http://ws.knowledge.com/", "addNewRecord");
    private final static QName _AddNewRecordResponse_QNAME = new QName("http://ws.knowledge.com/", "addNewRecordResponse");
    private final static QName _AddTag_QNAME = new QName("http://ws.knowledge.com/", "addTag");
    private final static QName _AddTagResponse_QNAME = new QName("http://ws.knowledge.com/", "addTagResponse");
    private final static QName _CreateTag_QNAME = new QName("http://ws.knowledge.com/", "createTag");
    private final static QName _CreateTagResponse_QNAME = new QName("http://ws.knowledge.com/", "createTagResponse");
    private final static QName _GetFile_QNAME = new QName("http://ws.knowledge.com/", "getFile");
    private final static QName _GetFileResponse_QNAME = new QName("http://ws.knowledge.com/", "getFileResponse");
    private final static QName _GetRecordMap_QNAME = new QName("http://ws.knowledge.com/", "getRecordMap");
    private final static QName _GetRecordMapResponse_QNAME = new QName("http://ws.knowledge.com/", "getRecordMapResponse");
    private final static QName _GetTagMap_QNAME = new QName("http://ws.knowledge.com/", "getTagMap");
    private final static QName _GetTagMapResponse_QNAME = new QName("http://ws.knowledge.com/", "getTagMapResponse");
    private final static QName _GetTaggedRecords_QNAME = new QName("http://ws.knowledge.com/", "getTaggedRecords");
    private final static QName _GetTaggedRecordsResponse_QNAME = new QName("http://ws.knowledge.com/", "getTaggedRecordsResponse");
    private final static QName _RemoveTag_QNAME = new QName("http://ws.knowledge.com/", "removeTag");
    private final static QName _RemoveTagResponse_QNAME = new QName("http://ws.knowledge.com/", "removeTagResponse");
    private final static QName _SayHello_QNAME = new QName("http://ws.knowledge.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.knowledge.com/", "sayHelloResponse");
    private final static QName _GetFileResponseReturn_QNAME = new QName("", "return");
    private final static QName _AddFileArg2_QNAME = new QName("", "arg2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.knowledge.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddFile }
     * 
     */
    public AddFile createAddFile() {
        return new AddFile();
    }

    /**
     * Create an instance of {@link AddFileResponse }
     * 
     */
    public AddFileResponse createAddFileResponse() {
        return new AddFileResponse();
    }

    /**
     * Create an instance of {@link AddNewRecord }
     * 
     */
    public AddNewRecord createAddNewRecord() {
        return new AddNewRecord();
    }

    /**
     * Create an instance of {@link AddNewRecordResponse }
     * 
     */
    public AddNewRecordResponse createAddNewRecordResponse() {
        return new AddNewRecordResponse();
    }

    /**
     * Create an instance of {@link AddTag }
     * 
     */
    public AddTag createAddTag() {
        return new AddTag();
    }

    /**
     * Create an instance of {@link AddTagResponse }
     * 
     */
    public AddTagResponse createAddTagResponse() {
        return new AddTagResponse();
    }

    /**
     * Create an instance of {@link CreateTag }
     * 
     */
    public CreateTag createCreateTag() {
        return new CreateTag();
    }

    /**
     * Create an instance of {@link CreateTagResponse }
     * 
     */
    public CreateTagResponse createCreateTagResponse() {
        return new CreateTagResponse();
    }

    /**
     * Create an instance of {@link GetFile }
     * 
     */
    public GetFile createGetFile() {
        return new GetFile();
    }

    /**
     * Create an instance of {@link GetFileResponse }
     * 
     */
    public GetFileResponse createGetFileResponse() {
        return new GetFileResponse();
    }

    /**
     * Create an instance of {@link GetRecordMap }
     * 
     */
    public GetRecordMap createGetRecordMap() {
        return new GetRecordMap();
    }

    /**
     * Create an instance of {@link GetRecordMapResponse }
     * 
     */
    public GetRecordMapResponse createGetRecordMapResponse() {
        return new GetRecordMapResponse();
    }

    /**
     * Create an instance of {@link GetTagMap }
     * 
     */
    public GetTagMap createGetTagMap() {
        return new GetTagMap();
    }

    /**
     * Create an instance of {@link GetTagMapResponse }
     * 
     */
    public GetTagMapResponse createGetTagMapResponse() {
        return new GetTagMapResponse();
    }

    /**
     * Create an instance of {@link GetTaggedRecords }
     * 
     */
    public GetTaggedRecords createGetTaggedRecords() {
        return new GetTaggedRecords();
    }

    /**
     * Create an instance of {@link GetTaggedRecordsResponse }
     * 
     */
    public GetTaggedRecordsResponse createGetTaggedRecordsResponse() {
        return new GetTaggedRecordsResponse();
    }

    /**
     * Create an instance of {@link RemoveTag }
     * 
     */
    public RemoveTag createRemoveTag() {
        return new RemoveTag();
    }

    /**
     * Create an instance of {@link RemoveTagResponse }
     * 
     */
    public RemoveTagResponse createRemoveTagResponse() {
        return new RemoveTagResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addFile")
    public JAXBElement<AddFile> createAddFile(AddFile value) {
        return new JAXBElement<AddFile>(_AddFile_QNAME, AddFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addFileResponse")
    public JAXBElement<AddFileResponse> createAddFileResponse(AddFileResponse value) {
        return new JAXBElement<AddFileResponse>(_AddFileResponse_QNAME, AddFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addNewRecord")
    public JAXBElement<AddNewRecord> createAddNewRecord(AddNewRecord value) {
        return new JAXBElement<AddNewRecord>(_AddNewRecord_QNAME, AddNewRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addNewRecordResponse")
    public JAXBElement<AddNewRecordResponse> createAddNewRecordResponse(AddNewRecordResponse value) {
        return new JAXBElement<AddNewRecordResponse>(_AddNewRecordResponse_QNAME, AddNewRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addTag")
    public JAXBElement<AddTag> createAddTag(AddTag value) {
        return new JAXBElement<AddTag>(_AddTag_QNAME, AddTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "addTagResponse")
    public JAXBElement<AddTagResponse> createAddTagResponse(AddTagResponse value) {
        return new JAXBElement<AddTagResponse>(_AddTagResponse_QNAME, AddTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "createTag")
    public JAXBElement<CreateTag> createCreateTag(CreateTag value) {
        return new JAXBElement<CreateTag>(_CreateTag_QNAME, CreateTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "createTagResponse")
    public JAXBElement<CreateTagResponse> createCreateTagResponse(CreateTagResponse value) {
        return new JAXBElement<CreateTagResponse>(_CreateTagResponse_QNAME, CreateTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getFile")
    public JAXBElement<GetFile> createGetFile(GetFile value) {
        return new JAXBElement<GetFile>(_GetFile_QNAME, GetFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getFileResponse")
    public JAXBElement<GetFileResponse> createGetFileResponse(GetFileResponse value) {
        return new JAXBElement<GetFileResponse>(_GetFileResponse_QNAME, GetFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getRecordMap")
    public JAXBElement<GetRecordMap> createGetRecordMap(GetRecordMap value) {
        return new JAXBElement<GetRecordMap>(_GetRecordMap_QNAME, GetRecordMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecordMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getRecordMapResponse")
    public JAXBElement<GetRecordMapResponse> createGetRecordMapResponse(GetRecordMapResponse value) {
        return new JAXBElement<GetRecordMapResponse>(_GetRecordMapResponse_QNAME, GetRecordMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getTagMap")
    public JAXBElement<GetTagMap> createGetTagMap(GetTagMap value) {
        return new JAXBElement<GetTagMap>(_GetTagMap_QNAME, GetTagMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getTagMapResponse")
    public JAXBElement<GetTagMapResponse> createGetTagMapResponse(GetTagMapResponse value) {
        return new JAXBElement<GetTagMapResponse>(_GetTagMapResponse_QNAME, GetTagMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedRecords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getTaggedRecords")
    public JAXBElement<GetTaggedRecords> createGetTaggedRecords(GetTaggedRecords value) {
        return new JAXBElement<GetTaggedRecords>(_GetTaggedRecords_QNAME, GetTaggedRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedRecordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "getTaggedRecordsResponse")
    public JAXBElement<GetTaggedRecordsResponse> createGetTaggedRecordsResponse(GetTaggedRecordsResponse value) {
        return new JAXBElement<GetTaggedRecordsResponse>(_GetTaggedRecordsResponse_QNAME, GetTaggedRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "removeTag")
    public JAXBElement<RemoveTag> createRemoveTag(RemoveTag value) {
        return new JAXBElement<RemoveTag>(_RemoveTag_QNAME, RemoveTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "removeTagResponse")
    public JAXBElement<RemoveTagResponse> createRemoveTagResponse(RemoveTagResponse value) {
        return new JAXBElement<RemoveTagResponse>(_RemoveTagResponse_QNAME, RemoveTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.knowledge.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetFileResponse.class)
    public JAXBElement<byte[]> createGetFileResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_GetFileResponseReturn_QNAME, byte[].class, GetFileResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg2", scope = AddFile.class)
    public JAXBElement<byte[]> createAddFileArg2(byte[] value) {
        return new JAXBElement<byte[]>(_AddFileArg2_QNAME, byte[].class, AddFile.class, ((byte[]) value));
    }

}
