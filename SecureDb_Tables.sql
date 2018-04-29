USE [SecureDb]
GO

/****** Object:  Table [dbo].[admin_cred]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[admin_cred](
	[sub_id] [varchar](30) NOT NULL,
	[pass] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[sub_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[incr]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[incr](
	[subid] [int] NULL,
	[pwd] [int] NULL,
	[obid] [int] NULL
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[incr1]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[incr1](
	[subid] [varchar](20) NULL,
	[pwd] [varchar](20) NULL,
	[obid] [varchar](20) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[obj_cat]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[obj_cat](
	[obj_id] [varchar](20) NULL,
	[obj_category] [varchar](30) NOT NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[object_cat]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[object_cat](
	[obj_id] [varchar](20) NULL,
	[obj_category] [varchar](20) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[object_clearence]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[object_clearence](
	[obj_id] [varchar](20) NOT NULL,
	[obj_name] [varchar](20) NULL,
	[obj_seclevel] [varchar](20) NULL,
 CONSTRAINT [object_clearence1] PRIMARY KEY CLUSTERED 
(
	[obj_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[seccat]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[seccat](
	[username] [nchar](30) NULL,
	[cat] [nchar](30) NULL,
	[type1] [nchar](30) NULL
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[secl]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[secl](
	[username] [nchar](30) NULL,
	[sec] [nchar](30) NULL
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[seclevel]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[seclevel](
	[username] [nchar](30) NOT NULL,
	[securitylevel] [nchar](30) NOT NULL,
	[type1] [nchar](30) NULL
) ON [PRIMARY]

GO

/****** Object:  Table [dbo].[sub_cat]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[sub_cat](
	[sub_id] [varchar](30) NOT NULL,
	[sub_category] [varchar](30) NOT NULL,
 CONSTRAINT [sub_cat2] PRIMARY KEY CLUSTERED 
(
	[sub_id] ASC,
	[sub_category] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[subject_clearence]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[subject_clearence](
	[sub_id] [varchar](30) NOT NULL,
	[sub_name] [varchar](50) NOT NULL,
	[sub_sec_level] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[sub_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblDoctor]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblDoctor](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NULL,
	[Password] [nvarchar](100) NULL,
	[Email] [varchar](100) NULL,
	[DateOfBirth] [date] NULL,
	[address] [nvarchar](max) NULL,
	[Qualification] [nvarchar](max) NULL,
	[PhoneNumber] [varchar](20) NULL,
	[UserCode] [varchar](100) NULL,
	[Experiance] [int] NULL,
	[Months] [int] NULL,
	[Specialization] [varchar](100) NULL,
	[CreatedOn] [datetime] NULL,
	[ModifiedOn] [datetime] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblLoginDetails]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblLoginDetails](
	[LoginId] [int] IDENTITY(1,1) NOT NULL,
	[UserCode] [varchar](100) NULL,
	[CreatedOn] [datetime] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblMessage]    Script Date: 14-04-2018 23:37:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblMessage](
	[MessageId] [int] IDENTITY(1,1) NOT NULL,
	[MessageName] [text] NULL,
	[CreatedOn] [datetime] NULL,
	[IsActive] [bit] NULL,
	[Titile] [varchar](max) NULL,
	[SecureMessage] [nvarchar](max) NULL,
	[EncryptedKey] [varchar](max) NULL,
	[DecryptedKey] [varchar](max) NULL,
	[PublicKey] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblPatient]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblPatient](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NULL,
	[Password] [nvarchar](100) NULL,
	[Email] [varchar](100) NULL,
	[DateOfBirth] [date] NULL,
	[address] [nvarchar](max) NULL,
	[UserCode] [varchar](100) NULL,
	[PhoneNumber] [varchar](20) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblRoleAccess]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblRoleAccess](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[PermissionId] [int] NULL,
	[PermissionCode] [varchar](100) NULL,
	[RoleCode] [varchar](100) NULL,
	[RoleName] [varchar](100) NULL,
	[CreateOn] [datetime] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblSpecialization]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblSpecialization](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Code] [varchar](100) NULL,
	[Name] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblUser]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblUser](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](100) NULL,
	[Password] [nvarchar](100) NULL,
	[PhoneNumber] [varchar](20) NULL,
	[UserCode] [varchar](100) NULL,
	[IsActive] [bit] NULL,
	[CreatedOn] [datetime] NULL,
	[RunningKey] [bigint] NULL,
	[ModifiedOn] [datetime] NULL,
	[UserType] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblUserKey]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblUserKey](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[UserCode] [varchar](100) NULL,
	[UserKey] [bigint] NULL,
	[CreatedOn] [datetime] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblUserKeys]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblUserKeys](
	[SenderCode] [varchar](max) NULL,
	[reciverCode] [varchar](100) NULL,
	[SenderKey] [varchar](max) NULL,
	[ReciverKey] [varchar](max) NULL,
	[PublicKey] [varchar](max) NULL,
	[PairRelation] [varchar](400) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblUserMessage]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblUserMessage](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Sender] [varchar](100) NULL,
	[Reciever] [varchar](100) NULL,
	[MessageId] [bigint] NULL,
	[CreatedOn] [datetime] NULL,
	[IsActive] [bit] NULL,
	[SenderStatusActive] [bit] NULL,
	[ReciverStatusActive] [bit] NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[tblUserType]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[tblUserType](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Usercode] [varchar](100) NULL,
	[UserType] [varchar](100) NULL
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[user_cred]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[user_cred](
	[sub_id] [varchar](30) NOT NULL,
	[pass] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[sub_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[userpasswd]    Script Date: 14-04-2018 23:37:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[userpasswd](
	[username] [nchar](30) NULL,
	[passwd] [nchar](30) NULL
) ON [PRIMARY]

GO

ALTER TABLE [dbo].[obj_cat]  WITH CHECK ADD  CONSTRAINT [obj_cat1] FOREIGN KEY([obj_id])
REFERENCES [dbo].[object_clearence] ([obj_id])
GO

ALTER TABLE [dbo].[obj_cat] CHECK CONSTRAINT [obj_cat1]
GO

ALTER TABLE [dbo].[sub_cat]  WITH CHECK ADD  CONSTRAINT [sub_cat1] FOREIGN KEY([sub_id])
REFERENCES [dbo].[subject_clearence] ([sub_id])
GO

ALTER TABLE [dbo].[sub_cat] CHECK CONSTRAINT [sub_cat1]
GO


