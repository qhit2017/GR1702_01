USE [db_employe]
GO
/****** Object:  Table [dbo].[employee01]    Script Date: 12/17/2017 19:33:28 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employee01](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NULL,
	[salary] [money] NOT NULL,
	[datalint] [date] NOT NULL,
	[recommend] [bit] NOT NULL,
	[department] [nvarchar](16) NOT NULL,
	[remarks] [ntext] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
